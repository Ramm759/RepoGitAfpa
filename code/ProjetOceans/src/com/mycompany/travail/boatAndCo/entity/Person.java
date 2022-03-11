package com.mycompany.travail.boatAndCo.entity;

public class Person {
    // Propriétés
    private String lastname;
    private String firstname;
    private int age;
    private String dateOfBirth;

    public Person() {
    }

    public Person(String lastname, String firstname) {
        this.lastname = lastname;
        this.firstname = firstname;
    }

    // Méthodes
    // Sans valeur de retour et sans parametres
    public void sePresenter() {
        System.out.println("Je m'appelle " + firstname + " " + lastname + " et j'ai " + age + " ans.");
    }

    // Avec valeur de retour
    public int renvoyerAge() {
        return this.age;

    }

    // Avec un parametre
    public int vieillir(int nbAnneesAAjouter) {
        return age + nbAnneesAAjouter;
    }

    // Avec plusieurs parametres
    public int calculerAnciennete(int anneeArrivee, boolean cotisAjour) {
        if (cotisAjour) {
            System.out.println("Mes cotisations sont à jour");
        } else {
            System.out.println("Mes cotisations ne sont pas à jour");
        }
        int anciennete = 2022 - anneeArrivee;
        return anciennete;

        // return 2022 - anneeArrivee;  // Syntaxe simplifiee
    }

    // Surcharge
    public void sePresenter(boolean cotisAJour) {
        if (cotisAJour) {
            System.out.println("Mes cotisations sont à jour");
        } else {
            System.out.println("Mes cotisations ne sont pas à jour");
        }
    }

    public void sePresenter(String cotisAJour) {

        if (cotisAJour == "cotisAJour") {
            System.out.println("Mes cotisations sont à jour");
        } else {
            System.out.println("Mes cotisations ne sont pas à jour");
        }
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
