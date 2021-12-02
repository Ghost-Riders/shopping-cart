package com.shopping.cart.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@AttributeOverrides({ @AttributeOverride(name = "productId", column = @Column(name = "productId")),
		@AttributeOverride(name = "productName", column = @Column(name = "productName")),
		@AttributeOverride(name = "fare", column = @Column(name = "fare")) })
public class Aparal extends Products {
	private String type;
	private String brand;
	private String design;

	public Aparal() {
		super();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDesign() {
		return design;
	}

	public void setDesign(String design) {
		this.design = design;
	}
}
