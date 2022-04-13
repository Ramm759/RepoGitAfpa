package com.mycompany.gestionstock.backend.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Client")
public class Client extends AbstractEntity{
    private String firstname;
    private String lastname;

    @ManyToOne
    private Address address;

    private String mail;
    private String numTel;
    private String photo;

    @OneToMany(mappedBy ="client")
    private List<CommandeClient> commandesClient;
}
