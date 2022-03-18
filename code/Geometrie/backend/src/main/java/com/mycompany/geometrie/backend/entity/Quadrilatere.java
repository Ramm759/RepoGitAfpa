package com.mycompany.geometrie.backend.entity;

public class Quadrilatere {
    private double cote;
    private double longueur;
    private double largeur;
    private String color;

    public Quadrilatere() {
    }

    public Quadrilatere(double cote) {
        this.cote = cote;
    }

    public Quadrilatere(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
