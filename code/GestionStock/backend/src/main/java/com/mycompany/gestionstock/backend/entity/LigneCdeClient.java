package com.mycompany.gestionstock.backend.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "LigneCdeClient")
public class LigneCdeClient extends AbstractEntity{
    private int quantité;

    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;

    @ManyToOne
    @JoinColumn(name = "commande_client_id")
    private CommandeClient commandeClient;



}
