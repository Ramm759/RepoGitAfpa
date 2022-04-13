package com.mycompany.gestionstock.backend.entity;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "CommandeFournisseur")
public class CommandeFournisseur extends AbstractEntity{
    private String codeCommande;
    private Instant dateCommande;

    @ManyToOne
    @JoinColumn(name = "fournisseur_id")
    private Fournisseur fournisseur;

    @OneToMany(mappedBy = "commandeFournisseur") // ??? Indispensable
    private List<LigneCdeFournisseur> lignesCdeFournisseur;



}
