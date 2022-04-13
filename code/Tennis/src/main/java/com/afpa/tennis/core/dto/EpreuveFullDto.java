package com.afpa.tennis.core.dto;

import com.afpa.tennis.core.entity.Joueur;
import com.afpa.tennis.core.entity.Tournoi;

import java.util.Set;

public class EpreuveFullDto {
    private Long id;
    private Short annee;
    private TournoiDto tournoi;
    private Character typeEpreuve;
    private Set<JoueurDto> participants;

    public Long getId() {
        return id;
    }

    public Set<JoueurDto> getParticipants() {
        return participants;
    }

    public void setParticipants(Set<JoueurDto> participants) {
        this.participants = participants;
    }

    public Character getTypeEpreuve() {
        return typeEpreuve;
    }

    public void setTypeEpreuve(Character typeEpreuve) {
        this.typeEpreuve = typeEpreuve;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getAnnee() {
        return annee;
    }

    public void setAnnee(Short annee) {
        this.annee = annee;
    }

    public TournoiDto getTournoi() {
        return tournoi;
    }

    public void setTournoi(TournoiDto tournoi) {
        this.tournoi = tournoi;
    }
}
