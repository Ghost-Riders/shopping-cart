package com.shopping.cart.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class UserCartEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;

	private String productName;
	private int quantity;
	private float fare;

	@OneToMany(cascade = CascadeType.ALL)
	private List<CartProductEntity> cartProductEntities;

	public UserCartEntity() {
	}

	public UserCartEntity(String productName, int quantity, float fare) {
		this.productName = productName;
		this.quantity = quantity;
		this.fare = fare;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getFare() {
		return fare;
	}

	public void setFare(float fare) {
		this.fare = fare;
	}

	public List<CartProductEntity> getCartProductEntities() {
		return cartProductEntities;
	}

	public void setCartProductEntities(List<CartProductEntity> cartProductEntities) {
		this.cartProductEntities = cartProductEntities;
	}

}
