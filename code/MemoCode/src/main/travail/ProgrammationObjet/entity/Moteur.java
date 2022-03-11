package main.travail.ProgrammationObjet.entity;

public class Moteur {
    private int nbCylindres;
    private String motorisation;

    public Moteur() {
    }

    public Moteur(int nbCylindres, String motorisation) {
        this.nbCylindres = nbCylindres;
        this.motorisation = motorisation;
    }

    // méthodes
    public void afficheMotorisation(){
        System.out.println("Il sagit d'un moteur " + motorisation);
    }

    // Getter & Setters

    public int getNbCylindres() {
        return nbCylindres;
    }

    public void setNbCylindres(int nbCylindres) {
        this.nbCylindres = nbCylindres;
    }

    public String getMotorisation() {
        return motorisation;
    }

    public void setMotorisation(String motorisation) {
        this.motorisation = motorisation;
    }
}
