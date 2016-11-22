package com.saini.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.saini.model.Cart;
import com.saini.model.Products;
import com.saini.service.CartService;
import com.saini.service.ProductsService;
@Controller
@SessionAttributes
public class CartController {

	@Autowired
	private ProductsService productsService;
	
	@Autowired
	private CartService cartService;
	
	@RequestMapping("/cart")
	public String getCart(@RequestParam("productId") int productId, Model model){
		Products p = productsService.getProduct(productId);
		model.addAttribute("product", p);
		
		return "cart";
	}
	
	@RequestMapping("/deleteCart")
	 public String deleteCart(@RequestParam int productId) {
		productsService.delete(productId);
	  return "redirect:cart";
	 }
	
	@RequestMapping("/orderConfirmation")
	public String setCart(@RequestParam("productId") int productId, Model model){
		Products p = productsService.getProduct(productId);
		model.addAttribute("product", p);
		
		return "orderConfirmation";
	}
	
	@ModelAttribute("instOrder")
	public Cart authentication()
	{
		return new Cart();
	}
	@RequestMapping("/orderConfirm")
	public String addNewOrder(@ModelAttribute("instOrder") Cart cart , BindingResult result,Model model,Principal p)
	{
		
		 Authentication auth=SecurityContextHolder.getContext().getAuthentication();
		 String name=auth.getName();
		 cart.setQuantity(1);
		 cart.setUsername(name);
	     cartService.addTocart(cart);
	     model.addAttribute("cart", cart);
	   
	   
		return "thankCustomer";
	}

}
