package com.example.gestionetudiants.dao;

import com.example.gestionetudiants.entity.Classe;

import java.util.List;

public interface ClasseDao {
    List<Classe> getAllClasses();

    Classe getClasseById(long id);


    void saveClasse(Classe classe);

}
