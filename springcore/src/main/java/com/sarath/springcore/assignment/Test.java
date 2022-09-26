package com.sarath.springcore.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sarath/springcore/assignment/listconfig.xml");
      ShoppingCart cart = (ShoppingCart)context.getBean("shoppingcart");	
      System.out.println(cart);
	
	}

} 