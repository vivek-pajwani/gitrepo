package com.mysoft.spring.test;

public class Person {
	private int id;
	private String name;
	private int taxId;
	Address address;
	
	public void setAddress(Address address) {
		this.address = address;
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public Person() {

	}

	public Person(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public void sayHello() {
		System.out.println("Hello I'm Vivek,How are your?");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId
				+ ", address=" + address + "]";
	}

	

}
