package com.eCoronaCart.service;

import com.eCoronaCart.model.CustomerOrder;

public interface CustomerOrderService {
	
	void addCustomerOrder(CustomerOrder customerOrder);
	
	double getCustomerOrderGrandTotal(int cartId);

}
