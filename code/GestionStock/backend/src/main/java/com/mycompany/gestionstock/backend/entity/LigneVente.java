package com.mycompany.gestionstock.backend.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "LigneVente")
public class LigneVente extends AbstractEntity{
    private Integer quantite;

    @ManyToOne
    private Vente vente;

    @ManyToOne
    private Article article;
}
