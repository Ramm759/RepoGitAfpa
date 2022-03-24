package com.afpa.tennis.controller;

import com.afpa.tennis.core.entity.Joueur;
import com.afpa.tennis.core.service.JoueurService;

import java.util.Scanner;

public class JoueurController {
    private JoueurService joueurService;

    public JoueurController(){
        this.joueurService = new JoueurService();
    }

    public void afficheDetailsJoueur(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quel est l'identifiant du joueur dont vous voulez récupérer les infos ?");
        long identifiant = scanner.nextLong();

        Joueur joueur = joueurService.getJoueur(identifiant);

        System.out.println("Le joueur s'appelle " + joueur.getPrenom() + " " + joueur.getNom() + ".");


    }
}
