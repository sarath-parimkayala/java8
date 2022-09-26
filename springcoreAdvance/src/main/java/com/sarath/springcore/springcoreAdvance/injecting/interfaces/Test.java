package com.sarath.springcore.springcoreAdvance.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sarath/springcore/springcoreAdvance/injecting/interfaces/config.xml");
		OrderBao orderbao = (OrderBao) context.getBean("bo");
		orderbao.PlaceOrder();
	}

}