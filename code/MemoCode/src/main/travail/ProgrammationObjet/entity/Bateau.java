package main.travail.ProgrammationObjet.entity;

import main.travail.ProgrammationObjet.Amarrable;

public class Bateau implements Amarrable {
    private int masse;

    @Override
    public int combienDeCordesNecessaires(int vitesseDuVent) {
        return masse / 10 + vitesseDuVent / 45;
    }

    public int getMasse() {
        return masse;
    }

    public void setMasse(int masse) {
        this.masse = masse;
    }
}
