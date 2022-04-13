package com.mycompany.gestionstock.backend.entity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "Vente")
public class Vente extends AbstractEntity{
    private String code;

    @OneToMany
    private List<LigneVente> lignesVente;
}
