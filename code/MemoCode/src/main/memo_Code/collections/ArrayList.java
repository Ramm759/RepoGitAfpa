package main.memo_Code.collections;

import main.memo_Code.ProgrammationObjet.entity.Voiture;

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
        System.out.println("Le deuxieme élément du tableau de String est  " + tableauString[1]);

        Voiture newVoiture = new Voiture();
        newVoiture.setMarque("Peugeot");

        // En passant par une variable
        tableauDeVoitures[2] = newVoiture;
        System.out.println("La marque de la voiture stockée à l'index 2 du tableau est " +tableauDeVoitures[2].getMarque());

        tableauDeVoitures[3] = new Voiture();   // Sans variable

        // Taille du tableau
        int tailleTableauInt = tableauString.length;
        System.out.println("La taille du tableau de int est : " + tailleTableauInt);

        // Parcours du tableau
        for (int index = 0; index < tableauInt.length; index++){
            System.out.println("tableauDeInt[" + index + "] contient "+ tableauInt[index]);
        }

        //
    }
}
