package com.mycompany.travail.boatAndCo.entity;

public class Cargo extends Boat {
    private int tonnageMax;

    public Cargo(String name, String color) {
        super(name, color);
    }

    public Cargo(String name, String color, int tonnageMax) {
        super(name, color);
        this.tonnageMax = tonnageMax;
    }

    public int getTonnageMax() {
        return tonnageMax;
    }

    public void setTonnageMax(int tonnageMax) {
        this.tonnageMax = tonnageMax;
    }
}
