package com.mycompany.gestionstock.backend.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Article")
public class Article extends AbstractEntity {
    @Column(name = "codeArticle")
    private String codeArticle;

    private String designation;

    private BigDecimal prixUnitaireHt;

    private BigDecimal tva;

    private BigDecimal prixUnitaireTtc;

    private String photo;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Category getCategory() {
        return category;
    }
}
