package com.mycompany.boatAndCo.entity;

public class Hydravion implements Amarrable{
   private int surfaceVoilure;

    public Hydravion(int surfaceVoilure) {
        this.surfaceVoilure = surfaceVoilure;
    }

    @Override
    public int amarrer(int vitesseDuVent) {
        return surfaceVoilure/3 + vitesseDuVent/4;
    }

    public int getSurfaceVoilure() {
        return surfaceVoilure;
    }

    public void setSurfaceVoilure(int surfaceVoilure) {
        this.surfaceVoilure = surfaceVoilure;
    }
}
