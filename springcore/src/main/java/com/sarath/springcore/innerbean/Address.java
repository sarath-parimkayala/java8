package com.sarath.springcore.innerbean;

public class Address {
	private int hno;
	private String street;
	private long phno;
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", street=" + street + ", phno=" + phno + "]";
	}
	

}
