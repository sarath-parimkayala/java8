package com.sarath.springjavaconfig;

import org.springframework.stereotype.Component;

@Component
public class Dao {
	public void create() {
		System.out.println("Dao created");
	}

}
