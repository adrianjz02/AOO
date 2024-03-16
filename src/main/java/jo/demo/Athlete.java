package jo.demo;

import java.util.ArrayList;
import java.util.List;

public class Athlete {
    private int id; // Identifiant unique de l'athlète
    private String nom;
    private String prenom;
    private String pays;
    private String sport;
    private String biographie;
    private List<String> competences; // Liste des compétences ou disciplines
    private List<String> reseauxSociaux; // URLs des profils sur les réseaux sociaux

    // Constructeur
    public Athlete(int id, String nom, String prenom, String pays, String sport) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.pays = pays;
        this.sport = sport;
        this.competences = new ArrayList<>();
        this.reseauxSociaux = new ArrayList<>();
    }
    
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getBiographie() {
        return biographie;
    }

    public void setBiographie(String biographie) {
        this.biographie = biographie;
    }

    public List<String> getCompetences() {
        return competences;
    }

    public void ajouterCompetence(String competence) {
        this.competences.add(competence);
    }

    public List<String> getReseauxSociaux() {
        return reseauxSociaux;
    }

    public void ajouterReseauSocial(String url) {
        this.reseauxSociaux.add(url);
    }

}

