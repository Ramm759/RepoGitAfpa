package main.memo_Code.ProgrammationObjet.notionsDeBase;

import main.memo_Code.ProgrammationObjet.entity.Passager;
import main.memo_Code.ProgrammationObjet.entity.VehiculeAMoteur;
import main.memo_Code.ProgrammationObjet.entity.Voiture;

public class Heritage {
    public static void main(String[] args) {

        Voiture voitureDeMichel = new Voiture("jaune", 4, "Diesel" );

        // Valorisation d'une propriété de la classe mère
        voitureDeMichel.setVitesse(45);

        Passager passagerMichel = new Passager("Durand", "Michel");
        voitureDeMichel.transporter(passagerMichel);

        voitureDeMichel.accelerer(40);

        // Polymorphisme
        VehiculeAMoteur voitureDeMartin = new Voiture();
        //voitureDeMartin.setMarque("Renault");
        voitureDeMartin.setVitesse(45);


        // transtypage
        // 1 ere méthode
        Voiture voitureDeMartinsousformeDeVoiture = (Voiture) voitureDeMartin; // transtypage

        // 2 eme méthode
        voitureDeMichel.setMarque("Citroen");
        ((Voiture)voitureDeMartin).setMarque("Renault"); // transtypage à la volée

        voitureDeMichel.transporter(passagerMichel);                // type Voiture
        voitureDeMartin.transporter(passagerMichel);                // type Véhicule à moteur

        Voiture newVoiture = new Voiture("jaune", 78);
        System.out.println("La vitesse est " + newVoiture.getVitesse() + " km/h");
        System.out.println("La couleur est : " + newVoiture.getCouleur());


    }
}
