package com.sarath.springcore.springcoreAdvance.injecting.interfaces.annotations;

import org.springframework.stereotype.Component;

@Component
public class OrderDaoImpl implements OrderDao{

	@Override
	public void createOrder() {
		System.out.println("Inside createOrder method");
		
	}

}
