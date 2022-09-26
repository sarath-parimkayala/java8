package com.sarath.springcore.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sarath.springcore.Employee;
import com.sarath.springcore.properties.Country;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/sarath/springcore/reftypes/config.xml");
		Student student =(Student) ctx.getBean("student");
		System.out.println(student);


	}

}
