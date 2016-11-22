package com.saini.dao.impl;

import javax.persistence.PersistenceContext;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.saini.dao.CartDAO;
import com.saini.model.Cart;
@Repository
@PersistenceContext
public class CartDAOImpl implements CartDAO {

	@Autowired
	private SessionFactory factory;
	
	public void addTocart(Cart cart) {
	 
		factory.getCurrentSession().save(cart);
	}


	public void deleteFromCart(int cartId) {

	   factory.getCurrentSession().delete(cartId);	
	}


	public Cart getFromCart(int cartId) {
	
		return (Cart)factory.getCurrentSession().get("Cart.class", cartId);
	}

}
