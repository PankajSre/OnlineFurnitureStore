package com.saini.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Item implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int itemId;
	@OneToOne
	@JoinColumn(name = "id")
	private Products p;
	
	private int quantity;
	@ManyToOne
	@JoinColumn(name = "cartId", insertable = false)
	private Shopping cart;

	public Item() {
	}

	public Item(Products p, int quantity) {
		this.p = p;
		this.quantity = quantity;
	}

	
	public int getItemId() {
		return itemId;
	}

	
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	
	public Products getP() {
		return p;
	}

	
	public void setP(Products p) {
		this.p = p;
	}

	public Shopping getCart() {
		return cart;
	}

	
	public void setCart(Shopping cart) {
		this.cart = cart;
	}

	
	public int getQuantity() {
		return quantity;
	}

	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
