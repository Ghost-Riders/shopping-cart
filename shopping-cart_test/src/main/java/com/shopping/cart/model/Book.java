package com.shopping.cart.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@AttributeOverrides({ @AttributeOverride(name = "productId", column = @Column(name = "productId")),
		@AttributeOverride(name = "productName", column = @Column(name = "productName")),
		@AttributeOverride(name = "fare", column = @Column(name = "fare")) })
public class Book extends Products {
	private String genre;
	private String auther;
	private String publications;

	public Book() {
		super();
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public String getPublications() {
		return publications;
	}

	public void setPublications(String publications) {
		this.publications = publications;
	}

}
