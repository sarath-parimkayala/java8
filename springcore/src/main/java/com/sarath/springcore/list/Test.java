package com.sarath.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sarath/springcore/list/listconfig.xml");
		Hospital hospital = (Hospital) context.getBean("hospital");
		System.out.println("Hospital name:"+hospital.getName());
		System.out.println("departments"+hospital.getDepartments());
	}

}
