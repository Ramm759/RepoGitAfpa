package com.mycompany.boatAndCo.entity;

public class Motor {
    private static String carburation = "Diesel";
    private int NbCylinder = 4;
    private String yearOfManufacture;

    public void demarrer(){
        System.out.println("Je démarre");
    }

    public static String getCarburation() {
        return carburation;
    }

    public static void setCarburation(String carburation) {
        Motor.carburation = carburation;
    }

    public int getNbCylinder() {
        return NbCylinder;
    }

    public void setNbCylinder(int nbCylinder) {
        NbCylinder = nbCylinder;
    }

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(String yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }
}
