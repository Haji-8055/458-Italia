package com.xworkz.overriding.things;

public class Pg extends Home {

	@Override
	public void display()
	{
		System.out.println("pg display method");

		super.display();
	}
}
