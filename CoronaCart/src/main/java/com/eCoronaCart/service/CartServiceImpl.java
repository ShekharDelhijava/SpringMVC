package com.eCoronaCart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eCoronaCart.dao.CartDao;
import com.eCoronaCart.model.Cart;
import com.eCoronaCart.service.CartService;

@Service
public class CartServiceImpl implements CartService{

	@Autowired 
	private CartDao cartDao;
	
	public Cart getCartById(int cartId) {
		
		return cartDao.getCartById(cartId);
	}

	public void update(Cart cart) {
		
		cartDao.update(cart);
	}

}
