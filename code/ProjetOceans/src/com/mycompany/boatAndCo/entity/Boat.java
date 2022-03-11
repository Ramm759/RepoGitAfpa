package com.mycompany.boatAndCo.entity;

public class Boat{
    public static String carburation = "Diesel";
    private static int nbOfBoatCreated = 0;
    private String name;
    private String brand; // marque
    private String color;
    private Motor motor;

    public Boat(){
        System.out.println("Un bateau est instancié à partir du constructeur vide");
        nbOfBoatCreated++;
    }

    public Boat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void naviguer() {
        System.out.println("Je navigue");
    }

    public void rentrerAuPort(Port port) {
        boolean restePlaceDisponible = port.restePlaceDisponible(port.getSites());

        if (restePlaceDisponible == false) {
            System.out.println("Il n'y a plus de places disponibles, je ne peux par rentrer au port");
        } else {
            System.out.println("Je rentre au port");
        }

    }
    public static int calculerDistanceParcourue(int duree, int vitesse){
        return duree* vitesse;
    }

    // Getters & Setters


    public static String getCarburation() {
        return carburation;
    }

    public static void setCarburation(String carburation) {
        Boat.carburation = carburation;
    }

    public static int getNbOfBoatCreated() {
        return nbOfBoatCreated;
    }

    public static void setNbOfBoatCreated(int nbOfBoatCreated) {
        Boat.nbOfBoatCreated = nbOfBoatCreated;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}