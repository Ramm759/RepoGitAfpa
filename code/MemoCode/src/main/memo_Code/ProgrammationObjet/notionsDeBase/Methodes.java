package main.memo_Code.ProgrammationObjet.notionsDeBase;

import main.memo_Code.ProgrammationObjet.entity.Passager;
import main.memo_Code.ProgrammationObjet.entity.Ville;
import main.memo_Code.ProgrammationObjet.entity.Voiture;

public class Methodes {
    public static void main(String[] args) {
        Voiture voitureDeMichel = new Voiture();

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

        // Methodes avec objets
        System.out.println("Methodes avec objets");

        Passager passagerDurand = new Passager();
        passagerDurand.setPrenom("Durand");
        passagerDurand.setPrenom("David");

        Ville maVille = new Ville();
        maVille.setNom("Lille");

        Voiture voitureDeMartin = new Voiture();

        Ville villeRetour = voitureDeMartin.transporter(passagerDurand, maVille);

        System.out.println("Le passager est arrivé à " + villeRetour.getNom());




    }
}
