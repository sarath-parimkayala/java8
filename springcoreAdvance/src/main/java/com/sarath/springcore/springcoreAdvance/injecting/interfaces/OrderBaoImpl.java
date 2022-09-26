package com.sarath.springcore.springcoreAdvance.injecting.interfaces;

public class OrderBaoImpl implements OrderBao{
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
