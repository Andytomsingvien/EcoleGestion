package com.example.gestionetudiants.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "niveau")
public class Niveau {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="intitule")
    private String intitule;

    public Niveau(){};

    public Niveau(Long id, String intitule) {
        this.id = id;
        this.intitule = intitule;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
}
