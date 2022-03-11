package main.memo_Code.structuresConditionnelles;

public class While {
    public static void main(String[] args) {
        int maVariable = 0;
        boolean maVariableBooleenne = false;

        // ### Nombre de répétitons déterminé
        System.out.println("Nombre de répétitons déterminé");

        while (maVariable < 4) {
            System.out.println("maVariable est < 4");
            maVariable++;
        }

        System.out.println();

        // ### Condition Booleenne
        System.out.println("Condition Booleenne");

        while (maVariableBooleenne) {
            System.out.println("maVariable vaut true");
            maVariableBooleenne = false;
        }

        System.out.println();

        // ### do - while
        System.out.println("do - while");

        do {
            System.out.println("Instruction réalisée au moins une fois");
            maVariableBooleenne = false;
        }
        while (maVariableBooleenne);
    }
}
