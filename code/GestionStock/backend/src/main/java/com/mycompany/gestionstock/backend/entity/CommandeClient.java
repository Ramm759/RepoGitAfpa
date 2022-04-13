package com.mycompany.gestionstock.backend.entity;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "CommandeClient")
public class CommandeClient extends AbstractEntity{
    private String refCommande;
    private Instant dateCommande;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "commandeClient")
    private List<LigneCdeClient> lignesCdeClient;



}
