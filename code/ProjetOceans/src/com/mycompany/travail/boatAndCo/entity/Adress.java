package com.mycompany.travail.boatAndCo.entity;

public class Adress {
    private int number;
    private String street;
    private int cp;
    private String city;

    private Adress() {
    }

    public Adress(int number, String street, int cp, String city) {
        this.number = number;
        this.street = street;
        this.cp = cp;
        this.city = city;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
