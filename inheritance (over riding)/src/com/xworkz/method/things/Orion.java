package com.xworkz.method.things;

public class Orion extends ShoppingMall{

	public String owner;
	
	public Orion(String name, String location,String owner) {
		super(name, location);
		this.owner=owner;
	}
	
	public void display()
	{
		super.display();
		System.out.println("owner of orion mall : "+owner);
	}

	
}
