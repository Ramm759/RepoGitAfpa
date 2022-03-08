package main.travail.ProgrammationObjet.entity;

import main.travail.ProgrammationObjet.Amarrable;

public class Port {
    public void accueilleEngin(Amarrable Amarrable){
        int nbCordes = Amarrable.combienDeCordesNecessaires(145);
        System.out.println("Le nombre de cordes nécessaires est de " + nbCordes + " .");
    }

}
