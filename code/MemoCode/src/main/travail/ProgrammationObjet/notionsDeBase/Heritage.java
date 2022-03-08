package main.travail.ProgrammationObjet.notionsDeBase;

import main.travail.ProgrammationObjet.entity.*;

public class Heritage {
    public static void main(String[] args) {
        // polymorphisme
        VehiculeAMoteur voitureDeMichel = new Voiture();
        Voiture voitureDeMichelsousformeDeVoiture = (Voiture) voitureDeMichel; // transtypage


        VehiculeAMoteur voitureDeMartin = new Voiture();

        voitureDeMartin.setVitesse(45);
        // voitureDeMartin.setMarque("Renaut"); // Impossible
        ((Voiture)voitureDeMichel).setMarque("Renaut");

        Passager passagerMichel = new Passager("Dupond", "Michel");
        Ville ville = new Ville("Lille");
        voitureDeMichel.transporter(passagerMichel, ville);
        voitureDeMartin.transporter(passagerMichel, ville);

        Moteur moteur = new Moteur();
        Voiture voitureDeDavid = new Voiture(moteur);

        UsineAssemblageVoiture usineAssemblageVoiture = new UsineAssemblageVoiture();
        Voiture voiture = usineAssemblageVoiture.assemble();


    }


}
