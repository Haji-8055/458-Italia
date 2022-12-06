package com.haji.instance.constructor;

import com.haji.instance.constants.AllDatatypes;

public class Bike {

	public String name;
	public AllDatatypes bike;
	
	public Bike(String name, AllDatatypes bike) {
		super();
		this.name = name;
		this.bike = bike;
	}
	
	public void display()
	{
		System.out.println("bike name is " + this.name);
		System.out.println("CC of bike is "+  bike.cc + " " + bike.name );
		System.out.println("brand of bike is ");
	}

}
