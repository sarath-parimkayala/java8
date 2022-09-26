package com.sarath.springcore.springcoreAdvance.injecting.interfaces.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bo")
public class OrderBaoImpl implements OrderBao{
	@Autowired
	private OrderDao dao;
	@Override
	public void PlaceOrder() {
		System.out.println("Inside orderBao");
		dao.createOrder();
	}
	public OrderDao getDao() {
		return dao;
	}
	public void setDao(OrderDao dao) {
		this.dao = dao;
	}
	

}
