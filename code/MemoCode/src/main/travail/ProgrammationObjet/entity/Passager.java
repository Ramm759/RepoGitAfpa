package main.travail.ProgrammationObjet.entity;

public class Passager {
    private String nom;
    private String prenom;

    public Passager() {
    }

    public Passager(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
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
}
