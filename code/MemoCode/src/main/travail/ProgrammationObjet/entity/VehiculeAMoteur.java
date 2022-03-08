package main.travail.ProgrammationObjet.entity;

public class VehiculeAMoteur {
    private static int nbVlAMoteurConstruits = 0;
    protected int vitesse = 0;
    protected Moteur moteur;

    public VehiculeAMoteur() {
        System.out.println("Un véhicule à moteur est construit");
        nbVlAMoteurConstruits++;
    }

    public VehiculeAMoteur(Moteur moteur){
        System.out.println("Une voiture est crée avec le constructeur qui prend en parametre un moteur");
        this.moteur = moteur;
    }

    // Methode avec plusieurs parametres
    public int accelerer(int vitesseActuelle, boolean accelerer, int ecartVitesse){
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
    public int accelerer(int vitesseActuelle, String accelererOuRalentir, int ecartVitesse){
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

    public void transporter (Passager passager){
        System.out.println("Je transporte un passager qui s'appelle "+ passager.getPrenom() +" " + passager.getNom());
    }

    public Ville transporter (Passager passager, Ville ville){
        System.out.println("Je transporte un passager qui s'appelle "+ passager.getPrenom() +" " + passager.getNom() +
                " en partant de " +ville.getNom());

        Ville villeArrivee = new Ville();
        villeArrivee.setNom("Paris");
        return villeArrivee;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public Moteur getMoteur() {
        return moteur;
    }

    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
    }
}
