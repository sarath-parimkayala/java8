package com.sarath.springcore.lc.xmlconfig;

public class Patient {
	private int id;

	public int getId() {
		return id;
	} 

	public void setId(int id) {
		System.out.println("Inside setter method");
		this.id = id;
	}
	public void hi() {
		System.out.println("Hi man");
	}
	public void by() {
		System.out.println("Inside by method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	

}
