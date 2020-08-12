package com.eCoronaCart.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eCoronaCart.dao.CartItemDao;
import com.eCoronaCart.model.Cart;
import com.eCoronaCart.model.CartItem;

@Repository
@Transactional
public class CartItemDaoImpl implements CartItemDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addCartItem(CartItem cartItem) {
		sessionFactory.getCurrentSession().saveOrUpdate(cartItem);
	}

	public void removeCartItem(CartItem cartItem) {
		sessionFactory.getCurrentSession().delete(cartItem);
		
	}

	public void removeAllCartItems(Cart cart) {
		
		List<CartItem> cartItems = cart.getCartItems();
		
		for(CartItem cartItem : cartItems){
			removeCartItem(cartItem);
		}
		
	}

	public CartItem getCartItemByProductId(int productId) {
		
		Query query = sessionFactory.getCurrentSession().createQuery("from CartItem where pid = ?");
		query.setInteger(0, productId);
		
		CartItem cartItem = (CartItem) query.uniqueResult();
		return cartItem;
	}

}
