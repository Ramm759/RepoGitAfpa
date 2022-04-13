package com.afpa.tennis.controller;

import com.afpa.tennis.core.dto.ScoreFullDto;
import com.afpa.tennis.core.service.ScoreService;

import java.util.Scanner;

public class ScoreController {
    private ScoreService scoreService;

    public ScoreController() {
        this.scoreService = new ScoreService();
    }

    public void afficheDetailsScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'identifiant du score dont vous voulez récupérer les infos ?");
        long identifiant = scanner.nextLong();
        ScoreFullDto scoreFullDto = scoreService.getScore(identifiant);
        System.out.println("Les sets sont :");
        System.out.println(scoreFullDto.getSet1());

        if (scoreFullDto.getSet3() != null) {
            System.out.println(scoreFullDto.getSet3());
        }

        if (scoreFullDto.getSet3() != null) {
            System.out.println(scoreFullDto.getSet4());
        }

        if (scoreFullDto.getSet3() != null) {
            System.out.println(scoreFullDto.getSet5());
        }

    }
}
