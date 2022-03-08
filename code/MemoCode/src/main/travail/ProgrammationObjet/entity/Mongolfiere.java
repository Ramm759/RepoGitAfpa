package main.travail.ProgrammationObjet.entity;

import main.travail.ProgrammationObjet.Amarrable;

public class Mongolfiere implements Amarrable {
    private int surface;

    @Override
    public int combienDeCordesNecessaires(int vitesseDuVent) {
        return surface / 50 + vitesseDuVent / 100;
    }

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }
}
