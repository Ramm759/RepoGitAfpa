package com.mycompany.gestionstock.backend.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Company")
public class Company extends AbstractEntity{
    private String name;

    @ManyToOne
    private Address address;

    private String mail;
    private String numTel;
}
