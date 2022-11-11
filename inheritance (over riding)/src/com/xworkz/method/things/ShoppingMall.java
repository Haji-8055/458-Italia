package com.xworkz.method.things;

public class ShoppingMall {
	
	public String name;
	public String location;

	public ShoppingMall(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	public void display() {
		System.out.println("name of mall : " + name);
		System.out.println("location of mall : " + location);

	}

}
