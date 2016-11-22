package com.saini.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.saini.dao.CartDAO;
import com.saini.model.Cart;
import com.saini.service.CartService;
@Service
@Transactional
public class CartServiceImpl implements CartService{

	@Autowired
	private CartDAO cartDAO;
	
	public void addTocart(Cart cart) {
		
		cartDAO.addTocart(cart);
	}

	
	public void deleteFromCart(int cartId) {
		
		cartDAO.deleteFromCart(cartId);
	}


	public Cart getFromCart(int cartId) {
		
		cartDAO.getFromCart(cartId);
		return null;
	}

}
