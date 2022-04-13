package com.afpa.tennis.core.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Epreuve {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Id généré par Mysql et auto-incrémenté
    private Long id;

    private Short annee;

    @ManyToOne (fetch = FetchType.LAZY) // Par défaut, fetchType = Eager
    @JoinColumn(name = "ID_TOURNOI")
    private Tournoi tournoi;

    @Column(name = "TYPE_EPREUVE", nullable = false, length = 20)
    private Character typeEpreuve;

    @ManyToMany // Relation xx to Many en Lazy par défaut
    @JoinTable(
            name = "PARTICIPANTS",  // nom table de jointure
            joinColumns = {@JoinColumn(name = "ID_EPREUVE")}, // nom colonne dans la table d'origine
            inverseJoinColumns = {@JoinColumn(name = "ID_JOUEUR")} // nom colonne autre table
    )
    private Set<Joueur> participants;

    public Set<Joueur> getParticipants() {
        return participants;
    }

    public void setParticipants(Set<Joueur> participants) {
        this.participants = participants;
    }

    public Epreuve() {
    }

    public Long getId() {
        return id;
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

    public Tournoi getTournoi() {
        return tournoi;
    }

    public void setTournoi(Tournoi tournoi) {
        this.tournoi = tournoi;
    }

    public Character getTypeEpreuve() {
        return typeEpreuve;
    }

    public void setTypeEpreuve(Character typeEpreuve) {
        this.typeEpreuve = typeEpreuve;
    }
}
