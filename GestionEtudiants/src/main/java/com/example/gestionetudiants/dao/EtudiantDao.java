package com.example.gestionetudiants.dao;

import com.example.gestionetudiants.entity.Classe;
import com.example.gestionetudiants.entity.Etudiant;

import java.util.List;

public interface EtudiantDao {
    void saveEtudiant(String nom, String prenom, int dateNaissance, Classe classe);

    List<Etudiant> getAllEtudiants();

    public Etudiant getEtudiantById(Long id);

}
