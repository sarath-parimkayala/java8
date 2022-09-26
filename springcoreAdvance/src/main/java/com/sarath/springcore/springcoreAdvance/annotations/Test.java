package com.sarath.springcore.springcoreAdvance.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sarath/springcore/springcoreAdvance/annotations/listconfig.xml");
		Employee employee = (Employee)context.getBean("employee");	
      System.out.println(employee);
      
	
	}

} 