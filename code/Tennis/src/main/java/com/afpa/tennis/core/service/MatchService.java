package com.afpa.tennis.core.service;

import com.afpa.tennis.core.dao.MatchDao;
import com.afpa.tennis.core.entity.Match;
import com.afpa.tennis.core.repository.MatchRepository;
import com.afpa.tennis.core.repository.ScoreRepository;

public class MatchService {
    private ScoreRepository scoreRepository;
    private MatchRepository matchRepository;
    // private MatchDao matchDao;

    public MatchService(){
       this.scoreRepository = new ScoreRepository();
       this.matchRepository = new MatchRepository();
       // this.matchDao = new MatchDao();
    }

    public void enregistrerNouveauMatch(Match match){
        matchRepository.create(match);
        scoreRepository.create(match.getScore());
    }

    public void modifierMatchWithScore(Match match){
        // matchDao.createMatchWithScore(match);
    }
}
