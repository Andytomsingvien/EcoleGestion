package com.example.gestionetudiants.Controller;

import com.example.gestionetudiants.dao.ClasseDao;
import com.example.gestionetudiants.dao.EtudiantDao;
import com.example.gestionetudiants.dao.NiveauDao;
import com.example.gestionetudiants.entity.Classe;
import com.example.gestionetudiants.entity.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EtudiantController {
    @Autowired
    private EtudiantDao etudiantDao;
    @Autowired
    private ClasseDao classeDao;
    @Autowired
    private NiveauDao niveauDao;

    @GetMapping("/formulaire")
    public String afficherFormulaire(Model model){
        model.addAttribute("etudiant",new Etudiant());
        model.addAttribute("niveaux", niveauDao.getAllNiveaux());
        return "formulaire";
    }

    @PostMapping("/ajouterEtudiant")
    public String enregistrerEtudiant(@ModelAttribute("etudiant") Etudiant etudiant){
        etudiantDao.saveEtudiant(etudiant.getNom(),etudiant.getPrenom(),etudiant.getDateNaissance(),etudiant.getClasse());
        return "redirect:/";
    }

    @GetMapping("/getClassesByNiveau/{id}")
    @ResponseBody
    public List<Classe> getClassesByNiveau(@PathVariable("id") Long id) {
        return niveauDao.getClassesByNiveauId(id);
    }

    @GetMapping("/listeEtudiants")
    public String afficherEtudiants(Model model) {
        List<Etudiant> etudiants = etudiantDao.getAllEtudiants();
        model.addAttribute("etudiants", etudiants);
        return "etudiants";
    }

    @GetMapping("/etudiant/{id}")
    public String afficherEtudiant(@PathVariable("id") Long id, Model model) {
        Etudiant etudiant = etudiantDao.getEtudiantById(id);
        model.addAttribute("etudiant", etudiant);
        return "etudiant";
    }

    @GetMapping("/")
    public String pageAccueil(Model model){
        return "index";
    }
}