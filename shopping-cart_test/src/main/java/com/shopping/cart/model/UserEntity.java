package com.shopping.cart.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;

	private String username;
	private String password;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "UserCartId")
	private UserCartEntity userCartEntity;

	public UserEntity() {
	}

	public UserEntity(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserCartEntity getUserCartEntity() {
		return userCartEntity;
	}

	public void setUserCartEntity(UserCartEntity userCartEntity) {
		this.userCartEntity = userCartEntity;
	}

}
