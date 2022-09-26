package com.sarath.springcore.springcoreAdvance.injecting.interfaces;

public class OrderDaoImpl implements OrderDao{

	@Override
	public void createOrder() {
		System.out.println("Inside createOrder method");
		
	}

}
