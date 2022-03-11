package com.mycompany.boatAndCo.entity;

public class Passager {
    public static int nbOfpassagersCreated = 0;
    private String lastname;
    private String firstname;
    private Adress address;

    public Passager() {
        System.out.println("Un passager est instancié via le constructeur sans paramètres");
        nbOfpassagersCreated++;
    }

    public Passager(String lastname){
        System.out.println("Un passager est instancié via le constructeur qui prend " +
                "en paramètre le nom du passager");
        this.lastname = lastname;
        nbOfpassagersCreated++;
    }

    public Passager (String lastname, String prenom){
        System.out.println("Un passager est instancié via le constructeur qui prend " +
                "en paramètre le nom et le prénom du passager");
        this.lastname = lastname;
        this.firstname = prenom;
        nbOfpassagersCreated++;
    }

    public Passager (String lastname, String prenom, Adress adress){
        System.out.println("Un passager est instancié via le constructeur qui prend " +
                "en paramètre le nom, le prénom  et l'adresse du passager du passager");
        this.lastname = lastname;
        this.firstname = prenom;
        this.address = adress;
        nbOfpassagersCreated++;
    }

    public Passager (String lastname, String prenom, int number, String street, int cp, String  city){
        System.out.println("Un passager est instancié via le constructeur qui prend " +
                "en paramètre le nom, le prénom  et l'adresse détaillée du passager");
        this.lastname = lastname;
        this.firstname = prenom;

        Adress adresse = new Adress(number, street, cp, city);

        this.address = adresse;

        nbOfpassagersCreated++;
    }

    public static int getNbOfpassagersCreated() {
        return nbOfpassagersCreated;
    }

    public static void setNbOfpassagersCreated(int nbOfpassagersCreated) {
        Passager.nbOfpassagersCreated = nbOfpassagersCreated;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Adress getAddress() {
        return address;
    }

    public void setAddress(Adress address) {
        this.address = address;
    }
}
