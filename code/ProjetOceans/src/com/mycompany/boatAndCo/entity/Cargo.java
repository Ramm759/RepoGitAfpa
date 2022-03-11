package com.mycompany.boatAndCo.entity;

public class Cargo extends Boat implements Amarrable{
    private int tonnageMax;
    private int weight;


    public Cargo(String name, String color) {
        super(name, color);
    }

    public Cargo(String name, String color, int tonnageMax) {
        super(name, color);
        this.tonnageMax = tonnageMax;
    }

    @Override
    public int amarrer(int vitesseDuVent) {
        return weight/2 + vitesseDuVent/4;
    }

    public int getTonnageMax() {
        return tonnageMax;
    }

    public void setTonnageMax(int tonnageMax) {
        this.tonnageMax = tonnageMax;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
