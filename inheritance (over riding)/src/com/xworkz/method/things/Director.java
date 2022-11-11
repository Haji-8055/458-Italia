package com.xworkz.method.things;

public class Director {

	public String name;
	public String anyOneMovie;

	public Director(String name, String anyOneMovie) {
		super();
		this.name = name;
		this.anyOneMovie = anyOneMovie;
	}
	
	public void display() {
		System.out.println("name : "+name);
		System.out.println("anyOneMovie name : "+anyOneMovie);
	}

}
