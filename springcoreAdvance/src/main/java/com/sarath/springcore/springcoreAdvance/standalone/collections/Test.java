package com.sarath.springcore.springcoreAdvance.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sarath/springcore/springcoreAdvance/standalone/collections/listconfig.xml");
		Productlist productlist = (Productlist)context.getBean("productNames");	
      System.out.println(productlist);
      
	
	}

} 