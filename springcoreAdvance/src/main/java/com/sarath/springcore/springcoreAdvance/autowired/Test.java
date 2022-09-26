package com.sarath.springcore.springcoreAdvance.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sarath/springcore/springcoreAdvance/autowired/listconfig.xml");
		Employee employee = (Employee)context.getBean("employee");	
      System.out.println(employee);
      
	
	}

} 