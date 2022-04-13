package com.mycompany.gestionstock.backend.entity;

import javax.persistence.*;

@Entity
@Table(name = "LigneCdeFournisseur")
public class LigneCdeFournisseur extends AbstractEntity{
    @ManyToOne
    private Article article;

    @ManyToOne
    @JoinColumn(name = "commande_fournisseur_id")
    private CommandeFournisseur commandeFournisseur;


}
