package com.afpa.tennis.core.service;

import com.afpa.tennis.core.entity.Match;
import com.afpa.tennis.core.repository.MatchRepository;
import com.afpa.tennis.core.repository.ScoreRepository;

public class MatchService {
    private ScoreRepository scoreRepository;
    private MatchRepository matchRepository;

    public MatchService(){
        this.scoreRepository = new ScoreRepository();
        this.matchRepository = new MatchRepository();
    }

    public void enregistrerNouveauMatch(Match match){
        matchRepository.create(match);
        scoreRepository.create(match.getScore());
    }
}
