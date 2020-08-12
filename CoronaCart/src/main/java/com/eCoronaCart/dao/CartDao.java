package com.eCoronaCart.dao;

import java.io.IOException;

import com.eCoronaCart.model.Cart;

public interface CartDao {
	
	Cart getCartById(int cartId) ;

	Cart validate(int cartId) throws IOException;
	
	void update(Cart cart) ;
}
