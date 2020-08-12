package com.eCoronaCart.dao;

import com.eCoronaCart.model.CustomerOrder;

public interface CustomerOrderDao {
	
	void addCustomerOrder(CustomerOrder customerOrder);
	
	double getCustomerOrderGrandTotal(int cartId);
}
