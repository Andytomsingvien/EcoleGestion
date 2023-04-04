package com.example.gestionetudiants.Impl;

import com.example.gestionetudiants.entity.Classe;
import com.example.gestionetudiants.entity.Niveau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NiveauRepository extends JpaRepository<Niveau, Long> {
    @Query("SELECT c FROM Classe c WHERE c.niveau.id = :niveauId")
    public List<Classe> getClassesByNiveauId(@Param("niveauId") Long niveauId);
}
