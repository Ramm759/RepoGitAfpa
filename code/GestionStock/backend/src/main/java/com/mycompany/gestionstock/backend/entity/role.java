package com.mycompany.gestionstock.backend.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class role extends AbstractEntity{
    private String role;

}
