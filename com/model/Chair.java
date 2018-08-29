package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Chair extends Furniture {
	
	@Column(name="manufacturing_company")
	private String manufacturingCompany;
	
	public String getManufacturingCompany() {
		return manufacturingCompany;
	}
	
	public void setManufacturingCompany(String manufacturingCompany) {
		this.manufacturingCompany = manufacturingCompany;
	}

}
