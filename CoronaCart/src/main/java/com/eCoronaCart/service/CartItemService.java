package com.eCoronaCart.service;

import com.eCoronaCart.model.Cart;
import com.eCoronaCart.model.CartItem;

public interface CartItemService {

	void addCartItem(CartItem cartItem);
	
	void removeCartItem(CartItem cartItem);
	
	void removeAllCartItems(Cart cart);
	
	CartItem getCartItemByProductId(int productId);
}
