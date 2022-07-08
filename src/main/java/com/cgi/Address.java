package com.cgi;

public class Address {
	private String street;
	private String city;
	private String state;

	
	public Address() {
		System.out.println("Address object is created..");
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	
}
