package com.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.GeneratedValue;

import java.util.List;

@Entity
public class DossierMedical implements Serializable {

    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue
    private long id;
    private String cin;

    public DossierMedical(){
        super();
    }

	public DossierMedical(String cin) {
		super();
		this.cin = cin;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}
    
}
