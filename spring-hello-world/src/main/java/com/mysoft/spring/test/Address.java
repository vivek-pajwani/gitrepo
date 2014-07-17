package com.mysoft.spring.test;

public class Address {
	private String street;
	private String pincode;

	public Address(String street, String pincode) {

		this.street = street;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", pincode=" + pincode + "]";
	}

}
