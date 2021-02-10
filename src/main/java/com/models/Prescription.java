package com.models;

import java.util.Date;

public class Prescription {
	private long id;

	private String reference;

	private String patientCin;

	private String produitReference;

	private Date DatePrescription;

	private String etat;

	private String instructions;

	private int quantite;

	public Prescription(long id, String reference, String patientCin, String produitReference, Date datePrescription,
			String etat, String instructions, int quantite) {
		super();
		this.id = id;
		this.reference = reference;
		this.patientCin = patientCin;
		this.produitReference = produitReference;
		DatePrescription = datePrescription;
		this.etat = etat;
		this.instructions = instructions;
		this.quantite = quantite;
	}

	public Prescription() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getPatientCin() {
		return patientCin;
	}

	public void setPatientCin(String patientCin) {
		this.patientCin = patientCin;
	}

	public String getProduitReference() {
		return produitReference;
	}

	public void setProduitReference(String produitReference) {
		this.produitReference = produitReference;
	}

	public Date getDatePrescription() {
		return DatePrescription;
	}

	public void setDatePrescription(Date datePrescription) {
		DatePrescription = datePrescription;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
}
