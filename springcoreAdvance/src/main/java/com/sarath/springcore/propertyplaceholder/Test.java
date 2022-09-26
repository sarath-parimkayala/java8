package com.sarath.springcore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sarath/springcore/propertyplaceholder/config.xml");
		MyDao mydao = (MyDao) context.getBean("myDao");
		System.out.println(mydao);
	}

}
