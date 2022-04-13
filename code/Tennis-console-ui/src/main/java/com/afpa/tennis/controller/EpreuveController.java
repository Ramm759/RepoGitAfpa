package com.afpa.tennis.controller;

import com.afpa.tennis.core.dto.EpreuveFullDto;
import com.afpa.tennis.core.dto.EpreuveLightDto;
import com.afpa.tennis.core.dto.JoueurDto;
import com.afpa.tennis.core.entity.Epreuve;
import com.afpa.tennis.core.service.EpreuveService;

import java.util.Scanner;

public class EpreuveController {
    private EpreuveService epreuveService;

    public EpreuveController(){
        this.epreuveService = new EpreuveService();
    }


    public void afficheDetailsEpreuve(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'identifiant de l'épreuve dont vous voulez récupérer les infos ?");
        long identifiant = scanner.nextLong();
        EpreuveFullDto epreuve = epreuveService.getEpreuveDetaillee(identifiant);
        System.out.println("Le nom du tournoi est : " + epreuve.getTournoi().getNom());

        for(JoueurDto joueurDto :epreuve.getParticipants()){
            System.out.println(joueurDto.getNom() + " " + joueurDto.getPrenom());
        }
    }

    public void afficheRollandGarros(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'identifiant de l'épreuve dont vous voulez récupérer les infos ?");
        long identifiant = scanner.nextLong();
        EpreuveLightDto epreuve = epreuveService.getEpreuveSansTournoi(identifiant);
        //System.out.println("Le nom du tournoi est : " + epreuve.getTournoi().getNom());
    }
}
