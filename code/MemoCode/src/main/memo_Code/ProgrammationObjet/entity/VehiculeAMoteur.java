package main.memo_Code.ProgrammationObjet.entity;

public class VehiculeAMoteur {
    private int vitesse = 0;

    public VehiculeAMoteur() {
        System.out.println("Un véhicule à moteur est instancié");
    }

    public VehiculeAMoteur(int vitesse) {
        System.out.println("Un objet est instancié via le constructeur de la classe VehiculeaMoteur avec le paramètre vitesse");
        this.vitesse = vitesse;
    }

    public void accelerer(){
        System.out.println("J'accelere");
    }

    /*int accelerer(int vitesseEnPlus){
        System.out.println("J'accelere de " + vitesseEnPlus + " km/h");
        return vitesseCourante + vitesseEnPlus;
    }*/

    // this
    public int accelerer(int vitesse){
        System.out.println("J'accelere de " + vitesse + " km/h");
        return this.vitesse + vitesse;
    }

    public void transporter (Passager passager){
        System.out.println("Le véhicule à moteur transporte un passager qui s'appelle "+ passager.getPrenom() +" " + passager.getNom());
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }
}
