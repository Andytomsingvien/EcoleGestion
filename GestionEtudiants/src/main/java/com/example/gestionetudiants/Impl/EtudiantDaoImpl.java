package com.example.gestionetudiants.Impl;

import com.example.gestionetudiants.dao.EtudiantDao;
import com.example.gestionetudiants.entity.Classe;
import com.example.gestionetudiants.entity.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public class EtudiantDaoImpl implements EtudiantDao {
    @Autowired
    private EtudiantRepository etudiantRepository;

    @Override
    public void saveEtudiant(String nom, String prenom, int dateNaissance, Classe classe){
        Etudiant etudiant = new Etudiant();
        etudiant.setNom(nom);
        etudiant.setPrenom(prenom);
        etudiant.setDateNaissance(dateNaissance);
        etudiant.getClasse();
        etudiantRepository.save(etudiant);
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }
    @Override
    public Etudiant getEtudiantById(Long id) {
        return etudiantRepository.findById(id).orElse(null);
    }
}
