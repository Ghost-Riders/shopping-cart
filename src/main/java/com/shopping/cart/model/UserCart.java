package com.shopping.cart.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class UserCart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String quantity;
	private float fare;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "productId")
	private List<Products> product;

	public UserCart() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public float getFare() {
		return fare;
	}

	public void setFare(float fare) {
		this.fare = fare;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public List<Products> getProduct() {
		return product;
	}

	public void setProduct(List<Products> product) {
		this.product = product;
	}

}
