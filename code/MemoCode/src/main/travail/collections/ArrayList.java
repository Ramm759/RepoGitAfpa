package main.travail.collections;

import main.travail.ProgrammationObjet.entity.*;

public class ArrayList {
    public static void main(String[] args) {
        // Initialisation
        int[] tableauInt = new int[5];
        String[] tableauString = new String[5];
        Voiture[] tableauDeVoitures = new Voiture[5];

        // Modification des valeurs
        tableauInt[0] = 9;  // Index 0 = 1ere case
        System.out.println("Le premier élément du tableau de int est " + tableauInt[0]);

        tableauString[1] = "toto";
        System.out.println("Le deuxielme élément du tableau de String est  " + tableauString[1]);

        Voiture newVoiture = new Voiture();     // En passant par une variable
        tableauDeVoitures[2] = newVoiture;

        tableauDeVoitures[3] = new Voiture();   // Sans variable

        // Taille du tableau
        int tailleTableauInt = tableauString.length;
        System.out.println("La taille du tableau de int est : " + tailleTableauInt);

        for (int index = 0; index < tableauString.length; index++){
            System.out.println("tableauString[" + index + "] contient " + tableauString[index]);
        }
    }
}
