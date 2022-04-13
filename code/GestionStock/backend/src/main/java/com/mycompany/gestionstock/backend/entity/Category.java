package com.mycompany.gestionstock.backend.entity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "Category")
public class Category extends AbstractEntity{
    private String code;
    private  String designation;

    @OneToMany(mappedBy = "category") // category = nom champ dans la table Article
    private List<Article> articles;
}
