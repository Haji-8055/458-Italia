package com.xworkz.method.things;

public class Prasanth extends Director {

	public int age;

	public Prasanth(String name, String anyOneMovie,int age) {
		super(name, anyOneMovie);
		this.age=age;
	}
	
	public void display() {
		super.display();
		System.out.println("age : "+age);
		
	}

}
