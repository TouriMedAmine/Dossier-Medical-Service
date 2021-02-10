package com.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Rdv {
	private long id;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;

	@DateTimeFormat(pattern = "HH:mm")
	private Date heure;

	private String cinPatient;

	private String cinMedecin;

	public Rdv(long id, Date date, Date heure, String cinPatient, String cinMedecin) {
		super();
		this.id = id;
		this.date = date;
		this.heure = heure;
		this.cinPatient = cinPatient;
		this.cinMedecin = cinMedecin;
	}

	public Rdv() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getHeure() {
		return heure;
	}

	public void setHeure(Date heure) {
		this.heure = heure;
	}

	public String getCinPatient() {
		return cinPatient;
	}

	public void setCinPatient(String cinPatient) {
		this.cinPatient = cinPatient;
	}

	public String getCinMedecin() {
		return cinMedecin;
	}

	public void setCinMedecin(String cinMedecin) {
		this.cinMedecin = cinMedecin;
	}
	
	
}
