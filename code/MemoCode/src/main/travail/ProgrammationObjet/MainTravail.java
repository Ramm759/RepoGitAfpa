package main.travail.ProgrammationObjet;

import main.travail.ProgrammationObjet.entity.*;

import java.util.Scanner;

public class MainTravail {
    public static void main(String[] args) {
        // instanciation d'un objet
        Voiture voitureDeMichel = new Voiture();
        Voiture voitureDeThomas = new Voiture();

        // Valorisation des proprietes
        voitureDeMichel.setImmatriculation("123AZE56");
        voitureDeMichel.setMarque("Renaut");
        System.out.println("Le nombre de porte de la voiture est " + voitureDeMichel.getNbPortes());

        // Modification de la valeur d'une propriété
        voitureDeMichel.setNbPortes(5);
        System.out.println("Le nombre de porte de la voiture est maintenant" + voitureDeMichel.getNbPortes());
        System.out.println("La voiture de Michel est de marque " + voitureDeMichel.getMarque() + ", son immatriculation est " + voitureDeMichel.getImmatriculation() + " et elle a " + voitureDeMichel.getNbPortes() + " portes");

        // Appel d'une méthode sans retour (void) et sans paramétres
        voitureDeMichel.klaxonner();

        // Avec une valeur de retour (utilisation d'une variable)
        int vitesseActuelle = voitureDeMichel.donnerVitesse();
        System.out.println(vitesseActuelle);

        // Avec une valeur de retour et un parametre
        System.out.println("Vitesse de départ : 45");
        System.out.println("La nouvelle vitesse est : "+voitureDeMichel.donnerNouvelleVitesse(45));

        // Avec plusieurs parametres
        System.out.println("La vitesse actuelle = 100");
        int nouvelleVitesse = voitureDeMichel.changerVitesse(100, true, 50);
        System.out.println("La nouvelle vitesse est : " + nouvelleVitesse);

        int vitesseEngagee = voitureDeMichel.passerUneVitesse(3, true);
        System.out.println("Je roule en vitesse " + vitesseEngagee);

        // Comparaison d'objets avec equals
        boolean sontEgaux = voitureDeMichel == voitureDeThomas;

        String chaine1 = "Il Fait froid dehors";
        String chaine2 = "Il fait froid dehors";

        sontEgaux = chaine1.equalsIgnoreCase(chaine2);
        System.out.println(sontEgaux);

        voitureDeMichel.changerVitesse(45, true, 20);
        System.out.println("Vitesse actuelle : " + vitesseActuelle);

        voitureDeMichel.changerVitesse(50, "accelerer", 30);
        System.out.println("Vitesse actuelle : " + vitesseActuelle);

        voitureDeMichel.accelerer();
        voitureDeMichel.accelerer(40);

        System.out.println();
        // Mot cle this
        System.out.println("Utilisation de this");

        nouvelleVitesse = voitureDeMichel.accelerer(40);
        System.out.println(nouvelleVitesse);

        Voiture voitureDeMartin = new Voiture();
        voitureDeMartin.setMarque("Citroen");

        voitureDeMartin.setImmatriculation("122ZZ62");
        voitureDeMartin.setNbPortes(4);

        String marqueDeLaVoitureDeMartin = voitureDeMartin.getMarque();
        int nbDePortesDeLaVoitureDeMartin = voitureDeMartin.getNbPortes();

        Moteur nouveauMoteur = new Moteur(4, "Essence");

        nouveauMoteur.afficheMotorisation();

        voitureDeMartin.setMoteur(nouveauMoteur);

        System.out.println("La motorisation du moteur de la voiture de Martin est " +voitureDeMartin.getMoteur().getMotorisation());

        System.out.println();

        // ArrayList
        System.out.println("ArrayList");

        int[] tableauInt =  new int[5];

        String[] tableauString = new String[5];

        Voiture[] tableauDeVoitures = new Voiture[5];

        tableauInt[0] = 9;
        System.out.println("Le premier élément du tableau de int est " + tableauInt[0]);

        tableauString[1] = "toto";
        System.out.println("Le deuxielme élément du tableau de String est  " + tableauString[1]);

        Voiture newVoiture = new Voiture();
        tableauDeVoitures[2] = newVoiture;

        tableauDeVoitures[3] = new Voiture();

        int tailleTableauInt = tableauString.length;
        System.out.println("La taille du tableau de int est : " + tailleTableauInt);

        System.out.println();

        // Methodes avec objets
        System.out.println("Methodes avec objets");

        Passager passagerDurand = new Passager();
        passagerDurand.setPrenom("Durand");
        passagerDurand.setPrenom("David");

        Ville maVille = new Ville();
        maVille.setNom("Lille");

        Ville villeRetour = voitureDeMartin.transporter(passagerDurand, maVille);

        System.out.println("Le passager est arrivé à " + villeRetour.getNom());

        System.out.println("Grace à la propriété statique, la voiture de Martin a " + Voiture.nbRoues);

        Voiture.nbRoues = 5;
        System.out.println("Grace à la propriété statique, la voiture de Martin a " + Voiture.nbRoues);

        // Appel methode statique
        System.out.println();
        Voiture.klaxonner();

        System.out.println("La nouvelle vitesse, calculée par la méthode statique est "+ Voiture.donnerNouvelleVitesse(50));

        System.out.println("Ma voiture a maintenant "+ Voiture.donnerNbRoues() + " roues");


        // Constructeurs
        Voiture voitureJaune = new Voiture("jaune");

        System.out.println("J'ai crée une voiture de couleur " + voitureJaune.getCouleur() + " grace au constructeur qui prend en parametre la couleur");

        Moteur moteurRenaut = new Moteur(4, "Essence");

        Voiture voitureRenaut = new Voiture(moteurRenaut);
        System.out.println("La voiture voitureRenaut a " + voitureRenaut.getMoteur().getNbCylindres() + " cylindres.");

        System.out.println();

        // Getters & Setters
        System.out.println("Getters & Setters");

        Moteur moteurDemo = new Moteur();

        moteurDemo.setMotorisation("Diesel");
        // remplace
        // moteurDemo.motorisation = "Diesel";

        System.out.println(moteurDemo.getMotorisation());
        // remplace
        // System.out.println(moteurDemo.motorisation);


        // Exercice Week-end
        Scanner sc = new Scanner(System.in);
        // System.out.print("Entrer un nombre: ");
        // int nbr1 = sc.nextInt();

        // System.out.println("Quelle opération voulez vous effectuer (addition, soustraction ...");
        // String op = sc.nextLine();

        // Héritage et interfaces
        // transporter() aprés déplacement dans VehiculeAMoteur

        voitureDeMichel.transporter(passagerDurand);

        // Covariance
        UsineAssemblage usineAssemblage = new UsineAssemblage();
        VehiculeAMoteur vehiculeAMoteur = usineAssemblage.assemble();

        System.out.println();

        // Interface
        System.out.println("Interface");
        Bateau bateau = new Bateau();
        bateau.setMasse(45);

        Mongolfiere mongolfiere = new Mongolfiere();
        mongolfiere.setSurface(70);

        Port port = new Port();
        port.accueilleEngin(bateau);
        port.accueilleEngin(mongolfiere);

    }
}
