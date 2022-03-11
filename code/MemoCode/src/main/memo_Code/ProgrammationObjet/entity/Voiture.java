package main.memo_Code.ProgrammationObjet.entity;

public class Voiture extends VehiculeAMoteur implements Vidangeable{
    public static int nbRoues = 4;
    private int nbPortes = 4;
    private int vitesseEngagee = 0;
    private int vitesseCourante = 0;
    private int vitesse = 0;

    private Moteur moteur;

    public Voiture(){
        super();
    }

    public Voiture(String couleur){
        super(couleur);
    }

    public Voiture(Moteur moteur){
        System.out.println("Une voiture est crée avec le constructeur qui prend en parametre un moteur");
        this.moteur = moteur;
    }

    public Voiture(String couleur, int nbCylindres, String motorisation){
        super(couleur);
        Moteur moteur = new Moteur(nbCylindres, motorisation);
        this.moteur = moteur;
    }

    // Méthodes (comportements)

    @Override
    public void vidanger() {
        System.out.println("Je dévisse le bouchon de vidange et je laisse couler l'huile");

    }

    // Methode avec 1 parametre
    public static int donnerNouvelleVitesse(int vitesseActuelle){
        return vitesseActuelle+10;
    }

    // Methode avec retour
    public int donnerVitesse(){
        return 100;
    }


    public int passerUneVitesse(int vitesseaEngageeCourante, boolean passerVitesseSuperieure){
        if (passerVitesseSuperieure = true){
            vitesseaEngageeCourante = vitesseaEngageeCourante + 1;
        }

        else {
            vitesseaEngageeCourante = vitesseaEngageeCourante -1;
        }

        return vitesseaEngageeCourante;
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
        System.out.println("Je transporte un passager qui s'appelle "+ passager.getPrenom() +" " + passager.getPrenom());
    }

    public Ville transporter (Passager passager, Ville ville){
        System.out.println("Je transporte un passager qui s'appelle "+ passager.getPrenom() +" " + passager.getPrenom() +
                " en partant de " +ville.getNom());

        Ville villeArrivee = new Ville();
        villeArrivee.setNom("Paris");
        return villeArrivee;
    }

    public static int donnerNbRoues(){
        return nbRoues++;
    }


    public static int getNbRoues() {
        return nbRoues;
    }

    public static void setNbRoues(int nbRoues) {
        Voiture.nbRoues = nbRoues;
    }

    public int getNbPortes() {
        return nbPortes;
    }

    public void setNbPortes(int nbPortes) {
        this.nbPortes = nbPortes;
    }

    public int getVitesseEngagee() {
        return vitesseEngagee;
    }

    public void setVitesseEngagee(int vitesseEngagee) {
        this.vitesseEngagee = vitesseEngagee;
    }

    public int getVitesseCourante() {
        return vitesseCourante;
    }

    public void setVitesseCourante(int vitesseCourante) {
        this.vitesseCourante = vitesseCourante;
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
