package com.eCoronaCart.dao;

import com.eCoronaCart.model.Cart;
import com.eCoronaCart.model.CartItem;

public interface CartItemDao {

	void addCartItem(CartItem cartItem);
	
	void removeCartItem(CartItem cartItem);
	
	void removeAllCartItems(Cart cart);
	
	CartItem getCartItemByProductId(int productId);
}
