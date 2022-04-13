package com.afpa.tennis.core.service;

import com.afpa.tennis.core.HibernateUtil;
import com.afpa.tennis.core.dto.*;
import com.afpa.tennis.core.entity.Match;
import com.afpa.tennis.core.entity.Score;
import com.afpa.tennis.core.repository.MatchRepository;
import com.afpa.tennis.core.repository.ScoreRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.loader.custom.ScalarReturn;

public class ScoreService {
    private ScoreRepository scoreRepository;
    private MatchRepository matchRepository;
    // private MatchDao matchDao;

    public ScoreService(){
        this.scoreRepository = new ScoreRepository();
        this.matchRepository = new MatchRepository();
        // this.matchDao = new MatchDao();
    }

    public ScoreFullDto getScore(Long id){
        Session session = null;
        Transaction tx = null;
        Score score = null;
        ScoreFullDto scoreFullDto = null;

        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            tx = session.beginTransaction();
            score = scoreRepository.getById(id);

            scoreFullDto = new ScoreFullDto();
            scoreFullDto.setId(score.getId());
            scoreFullDto.setSet1((score.getSet1()));
            scoreFullDto.setSet2((score.getSet2()));
            scoreFullDto.setSet3((score.getSet3()));
            scoreFullDto.setSet4((score.getSet4()));
            scoreFullDto.setSet5((score.getSet5()));

            MatchDto matchDto = new MatchDto();
            matchDto.setId(score.getMatch().getId());

            scoreFullDto.setMatch(matchDto);

            EpreuveFullDto epreuveFullDto = new EpreuveFullDto();
            epreuveFullDto.setId(score.getMatch().getEpreuve().getId());
            epreuveFullDto.setAnnee(score.getMatch().getEpreuve().getAnnee());
            epreuveFullDto.setTypeEpreuve(score.getMatch().getEpreuve().getTypeEpreuve());

            TournoiDto tournoiDto = new TournoiDto();
            tournoiDto.setId(score.getMatch().getEpreuve().getTournoi().getId());
            tournoiDto.setNom(score.getMatch().getEpreuve().getTournoi().getNom());
            tournoiDto.setCode(score.getMatch().getEpreuve().getTournoi().getCode());
            epreuveFullDto.setTournoi(tournoiDto);

            matchDto.setEpreuveFullDto(epreuveFullDto);

            tx.commit();

        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return scoreFullDto;
    }
}
