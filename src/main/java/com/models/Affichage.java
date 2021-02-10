package com.models;

import java.util.List;

import com.entities.DossierMedical;

public class Affichage {
	private DossierMedical dossierMedical;
	private List<Hospitalisation> hosp;
	private List<Prescription> pres;
	private List<Rdv> rdvs;
	
	public Affichage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Affichage(DossierMedical dossierMedical, List<Hospitalisation> hosp, List<Prescription> pres,
			List<Rdv> rdvs) {
		super();
		this.dossierMedical = dossierMedical;
		this.hosp = hosp;
		this.pres = pres;
		this.rdvs = rdvs;
	}

	public DossierMedical getDossierMedical() {
		return dossierMedical;
	}

	public void setDossierMedical(DossierMedical dossierMedical) {
		this.dossierMedical = dossierMedical;
	}

	public List<Hospitalisation> getHosp() {
		return hosp;
	}

	public void setHosp(List<Hospitalisation> hosp) {
		this.hosp = hosp;
	}

	public List<Prescription> getPres() {
		return pres;
	}

	public void setPres(List<Prescription> pres) {
		this.pres = pres;
	}

	public List<Rdv> getRdvs() {
		return rdvs;
	}

	public void setRdvs(List<Rdv> rdvs) {
		this.rdvs = rdvs;
	}
	
}
