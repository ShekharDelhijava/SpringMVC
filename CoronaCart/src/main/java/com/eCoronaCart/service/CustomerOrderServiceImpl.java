package com.eCoronaCart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eCoronaCart.dao.CartDao;
import com.eCoronaCart.dao.CustomerOrderDao;
import com.eCoronaCart.model.Cart;
import com.eCoronaCart.model.CartItem;
import com.eCoronaCart.model.CustomerOrder;
import com.eCoronaCart.service.CartService;
import com.eCoronaCart.service.CustomerOrderService;

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService{
	
	@Autowired
	private CustomerOrderDao customerOrderDao;
	
	@Autowired
	private CartDao cartDao;

	public void addCustomerOrder(CustomerOrder customerOrder) {
		customerOrderDao.addCustomerOrder(customerOrder);
		
	}

	public double getCustomerOrderGrandTotal(int cartId) {
		
		double grandTotal = 0;
		
		Cart cart = cartDao.getCartById(cartId);
		
		for(CartItem c: cart.getCartItems()){
			grandTotal = grandTotal + c.getTotalPrice();
		}
		
		return grandTotal;
	}

}
