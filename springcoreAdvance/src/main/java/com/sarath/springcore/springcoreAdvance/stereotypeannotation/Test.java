package com.sarath.springcore.springcoreAdvance.stereotypeannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sarath/springcore/springcoreAdvance/stereotypeannotation/config.xml");
		Instructor instructor = (Instructor)context.getBean("inst");	
      System.out.println(instructor);
      
      
	
	}

} 