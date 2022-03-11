package main.memo_Code.ProgrammationObjet.notionsDeBase;

import main.memo_Code.ProgrammationObjet.entity.Voiture;

public class Heritage {
    public static void main(String[] args) {
        // Appel constructeur vide de la classe mère
        Voiture voitureDeMichel = new Voiture();

        // Appel constructeur de la classe mère avec <couleur>
        Voiture voiture = new Voiture("Jaune");
        System.out.println("La voiture instanciée est de couleur " + voiture.getCouleur());


        Voiture voitureDeMarcel = new Voiture("Verte", 4, "Essence");
        System.out.println("La voiture de Marcel est de couleur " + voitureDeMarcel.getCouleur() + ", son moteur a " +
                + voitureDeMarcel.getMoteur().getNbCylindres() + " cylindres et est de type " + voitureDeMarcel.getMoteur().getMotorisation() + ".");

    }
}
