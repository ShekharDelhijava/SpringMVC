package com.eCoronaCart.service;

import com.eCoronaCart.model.Cart;

public interface CartService {

	Cart getCartById(int cartId);
	
	void update(Cart cart);
}
