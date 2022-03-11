package main.travail.ProgrammationObjet.notionsDeBase;

import main.travail.ProgrammationObjet.entity.*;

public class Heritage {
    public static void main(String[] args) {
        // Instanciation avec un super(couleur)
        System.out.println("Instanciation avec un super(couleur)");
        Voiture voitureDeMichel = new Voiture("jaune");
        System.out.println("La Voiture instanciée est de couleur " + voitureDeMichel.getCouleur());

        System.out.println();

        System.out.println("Instanciation avec un super(couleur) + constructeur Voiture");
        // Instanciation avec un super(couleur) + constructeur Voiture
        Voiture voitureDeRene = new Voiture("verte", 4, "Diesel");
        System.out.println("La voiture de René est de couleur "+ voitureDeRene.getCouleur() + " .Elle a "
        + voitureDeRene.getMoteur().getNbCylindres() + " et elle a un moteur "+ voitureDeRene.getMoteur().getMotorisation() + ".");

        }
}
