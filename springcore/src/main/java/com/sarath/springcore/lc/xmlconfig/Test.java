package com.sarath.springcore.lc.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/sarath/springcore/lc/xmlconfig/listconfig.xml");
		Patient cart = (Patient)context.getBean("patient");	
      System.out.println(cart);
      context.registerShutdownHook();
	
	}

} 