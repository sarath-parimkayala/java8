package com.sarath.springjavaconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Service {
	@Autowired
	Dao dao;

	public void save() {
		dao.create();
	}

	public void init() {
		System.out.println("Init() method called");
	}

	public void destroy() {
		System.out.println("destroy() method called");
	}
}
