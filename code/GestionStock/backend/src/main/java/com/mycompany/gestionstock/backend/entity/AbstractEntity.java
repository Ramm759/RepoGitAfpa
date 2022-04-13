package com.mycompany.gestionstock.backend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.Instant;

// @Data // (Lumbock pour getters / setters)
@MappedSuperclass   // Pas une entité, non persistée
@EntityListeners(AuditingEntityListener.class) // Ecoute pour update auto creationDate et LastModifiedDate
public class AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @CreatedDate
    @Column(name = "creationDate", nullable = false)
    @JsonIgnore
    private Instant creationDate;

    @LastModifiedDate
    @Column(name = "lastModifiedDate", nullable = false)
    @JsonIgnore
    private Instant lastModifiedDate;
}
