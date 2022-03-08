package main.memo_Code.ProgrammationObjet.notionsDeBase;

import main.travail.ProgrammationObjet.entity.Voiture;

public class Equals {
    public static void main(String[] args) {
    Voiture voitureDeMichel = new Voiture();
    Voiture voitureDeThomas = new Voiture();


        // anant equals
        boolean sontEgaux = voitureDeMichel == voitureDeThomas;

        String chaine1 = "Il Fait froid dehors";
        String chaine2 = "Il fait froid dehors";

        sontEgaux = chaine1.equalsIgnoreCase(chaine2);
        System.out.println(sontEgaux);
    }
}
