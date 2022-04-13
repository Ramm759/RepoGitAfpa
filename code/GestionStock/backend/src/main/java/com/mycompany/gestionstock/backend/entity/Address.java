package com.mycompany.gestionstock.backend.entity;

import javax.persistence.Entity;

@Entity
public class Address extends AbstractEntity {
    private String number;
    private String street;
    private Integer cp;
    private String city;
    private String country;


}
