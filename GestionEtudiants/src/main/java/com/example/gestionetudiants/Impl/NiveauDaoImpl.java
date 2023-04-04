package com.example.gestionetudiants.Impl;

import com.example.gestionetudiants.dao.NiveauDao;
import com.example.gestionetudiants.entity.Classe;
import com.example.gestionetudiants.entity.Niveau;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NiveauDaoImpl implements NiveauDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public NiveauDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Niveau> getAllNiveaux() {
        TypedQuery<Niveau> query = entityManager.createQuery("SELECT n FROM Niveau n", Niveau.class);
        return query.getResultList();
    }

    @Override
    public List<Classe> getClassesByNiveauId(Long id) {
        TypedQuery<Classe> query = entityManager.createQuery("SELECT c FROM Classe c WHERE c.niveau.id = :id", Classe.class);
        query.setParameter("id", id);
        return query.getResultList();
    }
}