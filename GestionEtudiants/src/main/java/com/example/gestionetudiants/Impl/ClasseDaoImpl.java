package com.example.gestionetudiants.Impl;

import com.example.gestionetudiants.dao.ClasseDao;
import com.example.gestionetudiants.entity.Classe;
import com.example.gestionetudiants.repository.ClasseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClasseDaoImpl implements ClasseDao {
    @Autowired
    private ClasseRepository classeRepository;

    @Override
    public void saveClasse(Classe classe) {
        classeRepository.save(classe);
    }

    @Override
    public Classe getClasseById(long id) {
        return classeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Classe> getAllClasses() {
        return classeRepository.findAll();
    }

}
