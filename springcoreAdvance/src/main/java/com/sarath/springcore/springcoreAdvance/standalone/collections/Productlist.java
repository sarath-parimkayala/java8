package com.sarath.springcore.springcoreAdvance.standalone.collections;

import java.util.List;

public class Productlist {
	private List<String> productlist;

	@Override
	public String toString() {
		return "Productlist [productlist=" + productlist + "]";
	}

	public List<String> getProductlist() {
		return productlist;
	}

	public void setProductlist(List<String> productlist) {
		this.productlist = productlist;
	}
	

}
