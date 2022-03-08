package main.travail.ProgrammationObjet.entity;

public class UsineAssemblage {
    public UsineAssemblage() {
    }

    public VehiculeAMoteur assemble(){
        Moteur moteur = new Moteur();
        VehiculeAMoteur vehiculeAMoteur = new VehiculeAMoteur(moteur);
        return vehiculeAMoteur;

    }
}
