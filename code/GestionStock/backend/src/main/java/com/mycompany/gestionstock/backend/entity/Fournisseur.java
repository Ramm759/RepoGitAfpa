package com.mycompany.gestionstock.backend.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Fournisseur")
public class Fournisseur extends AbstractEntity{
    private String firstname;
    private String lastname;

    @ManyToOne
    private Address address;

    private String mail;
    private String numTel;
    private String photo;

    @OneToMany(mappedBy = "fournisseur")
    private List<CommandeFournisseur> commandesFournisseur;

}
