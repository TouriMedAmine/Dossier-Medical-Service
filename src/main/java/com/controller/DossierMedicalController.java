package com.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.entities.DossierMedical;
import com.models.Affichage;
import com.models.Hospitalisation;
import com.models.HospitalisationList;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.service.DossierMedicalService;


@RestController
@RequestMapping("/dossiersMedicaux")
public class DossierMedicalController {


    @Autowired
    private DossierMedicalService dossierMedicalService;
    
    @Autowired
	public RestTemplate restTemplate;


    @PostMapping("/Dossier/add")
    public DossierMedical addDossierMedical(@RequestBody DossierMedical dossierMedical){
        return dossierMedicalService.saveDossierMedical(dossierMedical);
    }
    @PostMapping("/Dossier/Dossiers")
    public List<DossierMedical> addDossiers(@RequestBody List<DossierMedical> dossiers){
        return dossierMedicalService.saveDossiers(dossiers);
    }
    @GetMapping("/Dossier/DossierId")
    public List<DossierMedical> findAllDossiers() {
        return dossierMedicalService.getDossiers();
    }

    @GetMapping("/Dossier/DossierById/{id}")
    public DossierMedical findDossierMedicalById(@PathVariable Long id) {
        return dossierMedicalService.getDossierMedicalById(id);
    }

    @PutMapping("/Dossier/update")
    public DossierMedical updateDossierMedical(@RequestBody DossierMedical dossierMedical) {
        return dossierMedicalService.updateDossierMedical(dossierMedical);
    }

    @DeleteMapping("/Dossier/Delete{id}")
    public String deleteDossierMedical(@PathVariable Long id) {
        return dossierMedicalService.deleteDossierMedical(id);
    }
    
    @GetMapping("/Dossier/DossierByCin/{cin}")
    @HystrixCommand(fallbackMethod = "callHospitalisationServiceAndGetData_Fallback")
    public Affichage findDossierMedicalByCin(@PathVariable String cin) {
    	DossierMedical dossierMedical =  dossierMedicalService.getDossierMedicalByCin(cin);
    	HospitalisationList hosps = restTemplate.getForObject("http://HOSPITALISATION-SERVICE/hospitalisation/cinPatient/" + dossierMedical.getCin(),
    										HospitalisationList.class);
    	Affichage affichage = new Affichage();
    	affichage.setHosp(hosps.getHospList());
    	affichage.setDossierMedical(dossierMedical);
    	return affichage;
    }
    private Affichage callHospitalisationServiceAndGetData_Fallback(String cin) {

		System.out.println("Probleme du Patient service ou medecin service!!! fallback route enabled...");
		Affichage affichage = new Affichage();
		DossierMedical dossierMedical =  dossierMedicalService.getDossierMedicalByCin(cin);
		affichage.setDossierMedical(dossierMedical);
		return affichage;
	}


}
