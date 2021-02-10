package com.models;

import java.util.ArrayList;
import java.util.List;

public class PrescriptionList {
	private List<Prescription> presList;
	
	public PrescriptionList() {
		presList = new ArrayList<Prescription>();
	}

	public PrescriptionList(List<Prescription> presList) {
		super();
		this.presList = presList;
	}

	public List<Prescription> getPresList() {
		return presList;
	}

	public void setPresList(List<Prescription> presList) {
		this.presList = presList;
	}
	
	
}
