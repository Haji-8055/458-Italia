package com.xworkz.overriding.things;

public class HR {

	public int age;
	public String company;


	public HR(int age) {
		super();
		this.age = age;
	}



	public void display() {
		System.out.println("age : " + age);
	}
	
	public void display(String company) {
		this.company = company;
		System.out.println("company : " + company);

	}
}
