package com.saini.service;

import java.util.List;

import com.saini.model.Products;

public interface ProductsService {

	public void add(Products products);
	public void edit(Products products);
	public void delete(int productId);
	public Products getProduct(int productId);
	public List getAllProducts();
}
