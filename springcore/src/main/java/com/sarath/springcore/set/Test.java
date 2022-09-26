package com.sarath.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/sarath/springcore/set/setconfig.xml");
		CarDealer con = (CarDealer)context.getBean("cardealer");
		System.out.println("Cardelarsnames: "+con.getName());
		System.out.println("modelsnames: "+ con.getModels());
	}

}
