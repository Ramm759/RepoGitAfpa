package main.memo_Code.ProgrammationObjet.notionsDeBase;

import main.memo_Code.ProgrammationObjet.entity.Moteur;
import main.memo_Code.ProgrammationObjet.entity.Voiture;

public class Classes {
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

        // Propriétés statiques
        System.out.println("Grace à la propriété statique, la voiture de Martin a " + Voiture.nbRoues);

        Voiture.nbRoues = 5;
        System.out.println("Grace à la propriété statique, la voiture de Martin a " + Voiture.nbRoues);

        // Appel methode statique
        System.out.println();
        Voiture.klaxonner();

        System.out.println("La nouvelle vitesse, calculée par la méthode statique est "+ Voiture.donnerNouvelleVitesse(50));

        System.out.println("Ma voiture a maintenant "+ Voiture.donnerNbRoues() + " roues");

        // Constructeurs
        Voiture voitureJaune = new Voiture("jaune", 87);

        System.out.println("J'ai crée une voiture de couleur " + voitureJaune.getCouleur() + " grace au constructeur qui prend en parametre la couleur");

        Moteur moteurRenaut = new Moteur(4, "Essence");

        Voiture voitureRenaut = new Voiture(moteurRenaut);
        System.out.println("La voiture voitureRenaut a " + voitureRenaut.getMoteur().getNbCylindres() + " cylindres.");

        System.out.println();
    }
}
