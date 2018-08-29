package com.model;

import javax.persistence.Entity;

@Entity
public class Table extends Furniture{
	
	private String shape;

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

}
