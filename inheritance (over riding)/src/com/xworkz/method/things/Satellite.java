package com.xworkz.method.things;

public class Satellite {

	public String name;
	public int launchYear;

	public Satellite(String name, int launchYear) {
		super();
		this.name = name;
		this.launchYear = launchYear;
	}
	
	
	public void display() {
		
		System.out.println("satellite name : "+name);
		System.out.println("satellite launchYear : "+launchYear);
		
	}

}
