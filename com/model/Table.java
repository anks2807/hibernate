package com.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@javax.persistence.Table(name="table1")
@DiscriminatorValue(value="TABLE")
public class Table extends Furniture{
	
	private String shape;

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

}
