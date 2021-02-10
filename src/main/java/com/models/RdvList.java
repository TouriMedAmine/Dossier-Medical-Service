package com.models;

import java.util.ArrayList;
import java.util.List;

public class RdvList {
	private List<Rdv> rdvList;
	
	public RdvList() {
		rdvList = new ArrayList<Rdv>();
	}

	public RdvList(List<Rdv> rdvList) {
		super();
		this.rdvList = rdvList;
	}

	public List<Rdv> getRdvList() {
		return rdvList;
	}

	public void setRdvList(List<Rdv> rdvList) {
		this.rdvList = rdvList;
	}
	
}
