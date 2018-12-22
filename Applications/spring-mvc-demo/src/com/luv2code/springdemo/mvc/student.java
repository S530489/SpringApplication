package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class student {

	private String firstName;
	private String lastName;
	private String country;
	private String capital;
	private LinkedHashMap<String, String> capitalOptions;
	private String favoriteLanguage;
	private String[] operatingSystems;
	public student() {
		capitalOptions = new LinkedHashMap<>();
		
		capitalOptions.put("Del", "Delhi");
		capitalOptions.put("Syd", "Sydney");
		capitalOptions.put("BR", "BRA");
		capitalOptions.put("WDC", "Washnington DC");
		capitalOptions.put("CN", "CAN");
	}
	
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public LinkedHashMap<String, String> getCapitalOptions() {
		return capitalOptions;
	}
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}




	public String[] getOperatingSystems() {
		return operatingSystems;
	}




	public void setOperatingSystems(String[] operatingSystems) {
		System.out.println(operatingSystems);
		this.operatingSystems = operatingSystems;
	}
	
	
	
}
