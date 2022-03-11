package com.mycompany.boatAndCo.entity;

public class City {
    private String name;
    private Port port;

    public City(String nom, Port port) {
        System.out.println("J'instancie une ville avec son nom et un objet Port");
        this.name = nom;
        this.port = port;
    }

    public City(Port port) {
        System.out.println("J'instancie une ville avec un objet Port");
        this.port = port;
    }

    public City(String name, int nbEmplacements) {
        System.out.println("J'instancie une ville avec son nom et le nombre d'empalcements");
        this.name = name;
    }

    public String getNom() {
        return name;
    }

    public void setNom(String name) {
        this.name = name;
    }

    public Port getPort() {
        return port;
    }

    public void setPort(Port port) {
        this.port = port;
    }
}
