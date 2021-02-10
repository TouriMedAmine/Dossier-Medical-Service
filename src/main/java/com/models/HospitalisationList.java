package com.models;

import java.util.ArrayList;
import java.util.List;

public class HospitalisationList {
	private List<Hospitalisation> hospList;

	public HospitalisationList(List<Hospitalisation> hospList) {
		super();
		this.hospList = hospList;
	}

	public HospitalisationList() {
		this.hospList = new ArrayList<Hospitalisation>();
	}

	public List<Hospitalisation> getHospList() {
		return hospList;
	}

	public void setHospList(List<Hospitalisation> hospList) {
		this.hospList = hospList;
	}
	
	
}
