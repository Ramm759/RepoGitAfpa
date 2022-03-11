package com.mycompany.travail.boatAndCo.entity;

public class Screen {
    // Atributs statiques

    /*
    Cette classe instancie des écrans de différentes maniere
     */

    private static int nbEcranInstancies = 0;

    // Atributs
    private String marque;
    private String modele;
    private int taille;

    // Constructeurs
    public Screen() {
        nbEcranInstancies++;
    }

    /**
     *
     * @param marque
     * @param modele
     * @param taille
     */

    public Screen(String marque, String modele, int taille) {
        incrementerNbInstances();
        this.marque = marque;
        this.modele = modele;
        this.taille = taille;
    }

    // Méthodes statiques
    private static int incrementerNbInstances(){
        return nbEcranInstancies++;
    }

    /**
     * @author frédéric
     * @param texte
     * @param couleur
     * @return
     */
    // Méthodes non statiques
    public String afficherTexte (String texte, String couleur){
        System.out.println("J'affiche le texte " + texte + " de couleur " + couleur + ".");
        return "C'est ok";
    }

    // Getters & Setters
    public static int getNbEcranInstancies() {
        return nbEcranInstancies;
    }

    public static void setNbEcranInstancies(int nbEcranInstancies) {
        Screen.nbEcranInstancies = nbEcranInstancies;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }
}
