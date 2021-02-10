package com.models;

public class Hospitalisation {
	long id;
	String cinP;
	String cinM;
	long idAdmin;
	String duree;
	public Hospitalisation(long id, String cinP, String cinM, long idAdmin, String duree) {
		super();
		this.id = id;
		this.cinP = cinP;
		this.cinM = cinM;
		this.idAdmin = idAdmin;
		this.duree = duree;
	}
	public Hospitalisation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCinP() {
		return cinP;
	}
	public void setCinP(String cinP) {
		this.cinP = cinP;
	}
	public String getCinM() {
		return cinM;
	}
	public void setCinM(String cinM) {
		this.cinM = cinM;
	}
	public long getIdAdmin() {
		return idAdmin;
	}
	public void setIdAdmin(long idAdmin) {
		this.idAdmin = idAdmin;
	}
	public String getDuree() {
		return duree;
	}
	public void setDuree(String duree) {
		this.duree = duree;
	}
	
}
