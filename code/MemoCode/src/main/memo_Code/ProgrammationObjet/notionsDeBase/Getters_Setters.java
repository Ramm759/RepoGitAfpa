package main.memo_Code.ProgrammationObjet.notionsDeBase;

import main.memo_Code.ProgrammationObjet.entity.Moteur;
import main.memo_Code.ProgrammationObjet.entity.Voiture;

public class Getters_Setters {
    public static void main(String[] args) {
        Voiture voitureDeMartin = new Voiture();

        Moteur moteurDemo = new Moteur();

        moteurDemo.setMotorisation("Diesel");
        // remplace
        // moteurDemo.motorisation = "Diesel";

        System.out.println(moteurDemo.getMotorisation());
        // remplace
        // System.out.println(moteurDemo.motorisation);

        // Setter
        voitureDeMartin.setMarque("Citroen");

        // Getter
        System.out.println("La motorisation du moteur de la voiture de Martin est " +
                " " +voitureDeMartin.getMoteur().getMotorisation());

    }
}
