package main.memo_Code.structuresConditionnelles;

public class Switch {
    public static void main(String[] args) {
        int valeur = 4;

        switch (valeur) {
            case 4:
                System.out.println("valeur = 4");
                break;

            case 7:
                System.out.println("valeur = 7");
                break;

            default:
                System.out.println("autre valeur");
        }
    }
}
