package com.example.gestionetudiants.Impl;

import com.example.gestionetudiants.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

}
