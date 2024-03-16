package jo.demo;
import java.sql.*;

public class DBConnect {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bd_jo", "root", ""
            );
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from country");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
                ;

            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

