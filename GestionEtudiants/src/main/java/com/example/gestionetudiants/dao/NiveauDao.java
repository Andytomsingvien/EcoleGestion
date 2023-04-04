package com.example.gestionetudiants.dao;

import com.example.gestionetudiants.entity.Classe;
import com.example.gestionetudiants.entity.Niveau;

import java.util.List;

public interface NiveauDao {
    public List<Niveau> getAllNiveaux();
    public List<Classe> getClassesByNiveauId(Long id);
}
