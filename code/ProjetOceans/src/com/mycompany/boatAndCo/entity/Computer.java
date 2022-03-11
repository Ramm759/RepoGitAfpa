package com.mycompany.boatAndCo.entity;

public class Computer {
    public static int nbPcInstancies = 0;
    private String brandProcessor; // marque
    private Screen screen;

    public Computer() {
        nbPcInstancies++;
    }

    public Computer(String marqueProcesseur, Screen ecran) {
        System.out.println("Un ordinateur est instancié avec le constructeur qui prend en paramètre la marque du processeur et un objet Ecran");
        nbPcInstancies++;
        this.brandProcessor = marqueProcesseur;
        this.screen = ecran;
    }

    public Computer(String marqueProcesseur, String marqueEcran, String modeleEcran, int taille) {
        System.out.println("Un ordinateur est instancié avec le constructeur qui prend en paramètre la marque du processeur et " +
                "les propriétés de l'écran.");
        nbPcInstancies++;
        this.brandProcessor = marqueProcesseur;

        // Création écran
        Screen ecran = new Screen(marqueEcran, modeleEcran, taille);

        this.screen = ecran;
    }

    public static int getNbPcInstancies() {
        return nbPcInstancies;
    }

    public static void setNbPcInstancies(int nbPcInstancies) {
        Computer.nbPcInstancies = Computer.nbPcInstancies;
    }

    public String getMarqueProcesseur() {
        return brandProcessor;
    }

    public void setMarqueProcesseur(String marqueProcesseur) {
        this.brandProcessor = marqueProcesseur;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }
}
