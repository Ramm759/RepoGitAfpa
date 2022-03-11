package main.travail.ProgrammationObjet.entity;

public class VehiculeAMoteur {
    private String marque;
    private String immatriculation;
    private String couleur;

    public VehiculeAMoteur() {
    }

    public VehiculeAMoteur(String couleur) {
        System.out.println("Instanciation d'un véhicule à moteur via un constructeur de VehiculeAMoteur");
        this.couleur = couleur;
    }

    public VehiculeAMoteur(String marque, String immatriculation, String couleur) {
        this.marque = marque;
        this.immatriculation = immatriculation;
        this.couleur = couleur;
    }

    // Mehode sans retour (void) et sans paramétres
    public static void klaxonner(){
        System.out.println("Tut tut");
    }

    // Methode avec plusieurs parametres
    public int changerVitesse(int vitesseActuelle, boolean accelerer, int ecartVitesse){
        if(accelerer){
            System.out.println("J'accelere");
            vitesseActuelle +=ecartVitesse;
        }
        else {
            System.out.println("Je ralentis");
            vitesseActuelle -=ecartVitesse;
        }

        return vitesseActuelle;
    }

    // Surcharge de méthode
    public int changerVitesse(int vitesseActuelle, String accelererOuRalentir, int ecartVitesse){
        if(accelererOuRalentir == "accelerer"){
            System.out.println("J'accelere");
            vitesseActuelle +=ecartVitesse;
        }
        else {
            System.out.println("Je ralentis");
            vitesseActuelle -=ecartVitesse;
        }

        return vitesseActuelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
