package main.memo_Code.structuresConditionnelles;

public class If_OperateurTernaire {
    public static void main(String[] args) {
        int maVariable = 5;

        // Structure minimale sans le else
        System.out.println("Structure sans le else, obligatoire");
        if (maVariable == 5) {
            System.out.println("maVariable = 5, Condition = true");
        }

        System.out.println();

        // Structure complète avec else
        System.out.println("Structure complète avec else");
        if (maVariable == 5) {
            System.out.println("maVariable = 5, Condition = true");
        } else {
            System.out.println("maVariable = " + maVariable + " Condition = false");
        }

        System.out.println();

        // avec opérateur logique
        System.out.println("avec opérateur logique");

        int valeur1 = 4;
        int valeur2 = 8;

        if ((valeur1 == 4) | (valeur2 == 8)) {
            System.out.println("OK");
        }

        if ((valeur1 == 4) & (valeur2 == 8)) {
            System.out.println("OK");
        }

        System.out.println();

        // Structure imbriquée
        System.out.println("Structure imbriquée");
        if (maVariable == 5) {
            System.out.println("maVariable = 5, Condition = true");
        } else {

            if (maVariable == 7)
                System.out.println("maVariable = 7, Condition = false");
        }

        System.out.println();

        // Avec operateur ternaire
        System.out.println("Avec operateur ternaire");

        int condition = 4;

        System.out.println(condition == 4 ? "Condition = true" : "Condition = false");
        System.out.println(condition == 4 ? condition + "= true" : "Condition = false");
    }
}

