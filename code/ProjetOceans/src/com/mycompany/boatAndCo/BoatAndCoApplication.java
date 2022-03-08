package com.mycompany.boatAndCo;

import com.mycompany.boatAndCo.entity.*;

public class BoatAndCoApplication {
    public static void main(String[] args) {
        Person clientdurand = new Person();
        Person clientDupont = new Person();

        clientdurand.setFirstname("David");
        clientdurand.setLastname("Durand");
        clientdurand.setAge(45);
        clientdurand.setDateOfBirth("12/02/1974");

        // pas de valeur de retour, pas de parametre
        System.out.println("pas de valeur de retour, pas de parametre");

        clientdurand.sePresenter();

        System.out.println();

        // Avec une valeur de retour
        System.out.println("Avec une valeur de retour");

        System.out.println("M.Durand a " + clientdurand.renvoyerAge());

        System.out.println();

        // Avec 1 parametre
        System.out.println("Avec 1 parametre");

        System.out.println("M.Durand a " + clientdurand.getAge() + " ans.");
        int nouvelAge = clientdurand.vieillir(45);
        System.out.println("Après l'appel de la méthode vieillir, l'age est = " + nouvelAge);
        System.out.println("La propriété age a toujours la valeur :  " + clientdurand.getAge());

        clientdurand.setAge(clientdurand.vieillir(45));
        System.out.println("age vaut maintenant : " + clientdurand.getAge());

        System.out.println();

        // Avec plusieurs parametres
        System.out.println("Avec plusieurs parametres");

        int anneeAnciennete = clientdurand.calculerAnciennete(2007, true);

        System.out.println("Monsieur " + clientdurand.getFirstname() + " " + clientdurand.getLastname() + " a " + anneeAnciennete + " ans d'anciennete");

        System.out.println();

        // Surcharge
        System.out.println("Surcharge de méthodes");

        clientdurand.sePresenter();
        clientdurand.sePresenter(false);
        clientdurand.sePresenter("cotisPasAJour");

        System.out.println();

        // Ajout d'une propriété de type objet
        System.out.println("Ajout d'une propriété de type objet");

        Boat boatDeMichel = new Boat();
        boatDeMichel.setBrand("Honda");
        boatDeMichel.setColor("Blanc");

        Motor motor = new Motor();
        motor.setYearOfManufacture("1998");
        motor.setNbCylinder(4);

        boatDeMichel.setMotor(motor);
        System.out.println(boatDeMichel.getColor());

        System.out.println("Le moteur du bateau de Michel est du type : " + Boat.getCarburation());

        System.out.println();

        // Exercice Surcharge
        System.out.println("Exercice Surcharge");


        System.out.println();

        // Exercice Ocean : ArrayList

        System.out.println("Exercice Ocean : ArrayList");
        Port portDeCalais = new Port();
        portDeCalais.setName("Calais");
        portDeCalais.setNbOfDisponiblesSites(4);

        int nbEmplacements = 5;

        portDeCalais.setSites(new Boat[nbEmplacements]);

        boatDeMichel.rentrerAuPort(portDeCalais);

        Port monPort = new Port();

        System.out.println();
        // Proprietes statiques
        System.out.println("Proprietes statiques");

        System.out.println("Grace à la propriété statique, tous les bateaux instanciés ont un moteur " + Motor.getCarburation());

        System.out.println();
        // Exercice Ocean
        System.out.println("exercice Ocean");

        // int distanceParcourue = Bateau.calculerDistanceParcourue(3,45);

        System.out.println("Nous avons parcouru " + Boat.calculerDistanceParcourue(3, 45) +
                " kms grace au moteur " + Motor.getCarburation() + " du bateau");

        System.out.println();

        // Les constructeurs
        System.out.println("Les constructeurs");
        Boat newBoat = new Boat();

        System.out.println(Boat.getNbOfBoatCreated() + " bateaux ont été instanciés");

        City cityDeCalais = new City("Calais", portDeCalais);
        System.out.println("La ville de " + cityDeCalais.getNom() + " a un port de " + cityDeCalais.getPort().getName() + " emplacements.");

        // Heritage
        Cargo costarica = new Cargo("Costarika", "Blanc", 45);

        System.out.println("le bateau " +costarica.getName() + " est de couleur " + costarica.getColor() +
                " son tonnage max est " + costarica.getTonnageMax() + ".");


        // Interfaces

        System.out.println("Pour amarrer, le bateau a besoin de " + costarica.amarrer(85));

        Hydravion hydravion = new Hydravion(85);
        System.out.println("Pour amarrer, l'hydravion a besoin de " + hydravion.amarrer(56));
    }
}