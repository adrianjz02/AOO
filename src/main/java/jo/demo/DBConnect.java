package jo.demo;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DBConnect {

    // Méthode centralisée pour obtenir une connexion à la base de données
    private static Connection connecterDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_jo", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Connection connection = connecterDB();
        if (connection != null) {
            try {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM athleteprofile");
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
                }
                connection.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static Athlete obtenirAthleteParId(int id) {
        String sql = "SELECT * FROM athleteprofile WHERE athleteid = ?";
    
        try (Connection connection = connecterDB();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
    
            if (resultSet.next()) {
                Athlete athlete = new Athlete(
                    resultSet.getInt("athleteid"),
                    resultSet.getString("firstNameAthlete"),
                    resultSet.getString("lastNameAthlete"),
                    resultSet.getString("nationality"),
                    resultSet.getString("sport"));
                
                return athlete;
            }
        } catch (SQLException e) {
            System.out.println("Erreur lors de la récupération de l'athlète avec l'ID " + id + ": " + e.getMessage());
        }
        return null; // Retourne null si aucun athlète n'a été trouvé ou en cas d'erreur
    }

    public static List<Athlete> obtenirAthletes() {
    List<Athlete> athletes = new ArrayList<>();
    String sql = "SELECT * FROM athleteprofile";

    try (Connection connection = connecterDB();
         PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            Athlete athlete = new Athlete(
                resultSet.getInt("athleteid"),
                resultSet.getString("firstNameAthlete"),
                resultSet.getString("lastNameAthlete"),
                resultSet.getString("nationality"),
                resultSet.getString("sport")
            );

            athlete.setBiographie(resultSet.getString("biography"));

            // Supposons que 'competences' et 'reseauxSociaux' sont des champs séparés par des virgules
            String competencesStr = resultSet.getString("specialSkills");
            if (competencesStr != null && !competencesStr.isEmpty()) {
                Arrays.asList(competencesStr.split(",")).forEach(competence ->
                    athlete.ajouterCompetence(competence.trim()));
            }

            String reseauxSociauxStr = resultSet.getString("socialMediaLinks");
            if (reseauxSociauxStr != null && !reseauxSociauxStr.isEmpty()) {
                Arrays.asList(reseauxSociauxStr.split(",")).forEach(reseauSocial ->
                    athlete.ajouterReseauSocial(reseauSocial.trim()));
            }

            // Ajoutez l'athlète à la liste des athlètes
            athletes.add(athlete);
        }
    } catch (SQLException e) {
        System.out.println("Erreur lors de la récupération des athlètes: " + e.getMessage());
    }

    return athletes;
}

}
