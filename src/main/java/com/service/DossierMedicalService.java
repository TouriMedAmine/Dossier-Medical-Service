package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.DossierMedical;
import com.repository.DossierMedicalRepository;

@Service
public class DossierMedicalService {

    @Autowired
    private DossierMedicalRepository dossierMedicalRepository;

    public DossierMedical saveDossierMedical(DossierMedical dossierMedical){
       
        return dossierMedicalRepository.save(dossierMedical);
    }
    public List<DossierMedical> saveDossiers(List<DossierMedical> dossiers){
        return dossierMedicalRepository.saveAll(dossiers);
    }
    public List<DossierMedical> getDossiers(){
        return dossierMedicalRepository.findAll();
    }
    public DossierMedical getDossierMedicalById(Long id){
        return dossierMedicalRepository.findById(id).orElse(null);
    }
    public String deleteDossierMedical(Long id){
        dossierMedicalRepository.deleteById(id);
        return "dossier" +id+ "supprimé!";
    }
    public DossierMedical updateDossierMedical(DossierMedical dossierMedical) {
        DossierMedical existingDossierMedical = dossierMedicalRepository.findById(dossierMedical.getId()).orElse(null);

        existingDossierMedical.setCin(dossierMedical.getCin());

        return dossierMedicalRepository.save(existingDossierMedical);
    }
    public DossierMedical getDossierMedicalByCin(String cin) {
    	return dossierMedicalRepository.trouverDossierMedicalParCin(cin);
    }
}
