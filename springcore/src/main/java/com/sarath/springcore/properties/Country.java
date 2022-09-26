package com.sarath.springcore.properties;

import java.util.Properties;

public class Country {
	private Properties countriesndlang;

	@Override
	public String toString() {
		return "Country [countriesndlang=" + countriesndlang + "]";
	}

	public Properties getCountriesndlang() {
		return countriesndlang;
	}

	public void setCountriesndlang(Properties countriesndlang) {
		this.countriesndlang = countriesndlang;
	}

}
