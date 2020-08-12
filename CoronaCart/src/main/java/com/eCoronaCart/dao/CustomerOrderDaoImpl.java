package com.eCoronaCart.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.eCoronaCart.dao.CustomerOrderDao;
import com.eCoronaCart.model.CustomerOrder;

@Repository
@Transactional
public class CustomerOrderDaoImpl implements CustomerOrderDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addCustomerOrder(CustomerOrder customerOrder) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(customerOrder);
		
	}

	public double getCustomerOrderGrandTotal(int cartId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
