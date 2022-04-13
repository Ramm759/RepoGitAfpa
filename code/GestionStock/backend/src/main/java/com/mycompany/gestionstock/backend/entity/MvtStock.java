package com.mycompany.gestionstock.backend.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MvtStock")
public class MvtStock extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name = "article_id")
    Article article;


}
