package jo.demo;

import java.util.List;
import java.util.Scanner;

public class ApplicationCLI {

    private DBConnect dbConnect = new DBConnect();

    public void demarrer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue sur la plateforme des JO 2024 !");
        System.out.println("Tapez 'profil' pour afficher tous les profils des athlètes,");
        System.out.println("ou 'profil <ID>' pour afficher les détails d'un athlète spécifique (remplacez <ID> par l'ID de l'athlète).");
        System.out.println("Tapez 'quitter' pour fermer l'application.");

        String commande;
        do {
            System.out.print("Entrez votre commande : ");
            commande = scanner.nextLine();
            traiterCommande(commande);
        } while (!commande.equalsIgnoreCase("quitter"));
    }

    private void traiterCommande(String commande) {
        if (commande.startsWith("profil")) {
            if (commande.trim().equalsIgnoreCase("profil")) {
                afficherTousLesProfils();
            } else {
                String[] parts = commande.split(" ");
                if (parts.length == 2) {
                    int id = Integer.parseInt(parts[1]);
                    afficherProfilParId(id);
                }
            }
        } else {
            System.out.println("Commande non reconnue. Réessayez.");
        }
    }

    private void afficherTousLesProfils() {
        List<Athlete> athletes = DBConnect.obtenirAthletes();
        for (Athlete athlete : athletes) {
            System.out.println(athlete.getId() + " : " + athlete.getNom() + " " + athlete.getPrenom());
        }
    }

    private void afficherProfilParId(int id) {
        // Cette méthode suppose que vous avez une méthode dans DBConnect ou ailleurs pour obtenir un athlète par son ID.
        Athlete athlete = DBConnect.obtenirAthleteParId(id);
        if (athlete != null) {
            System.out.println("ID: " + athlete.getId());
            System.out.println("Nom: " + athlete.getNom());
            System.out.println("Prénom: " + athlete.getPrenom());
            System.out.println("Pays: " + athlete.getPays());
            System.out.println("Sport: " + athlete.getSport());
            // Ajoutez ici d'autres informations à afficher
        } else {
            System.out.println("Aucun athlète trouvé avec l'ID " + id);
        }
    }

    public static void main(String[] args) {
        new ApplicationCLI().demarrer();
    }
}
