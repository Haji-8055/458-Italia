package com.xworkz.method.things;

public class Ravi extends Criminal{
	public boolean isLifePrison;

	public Ravi(String type, int cases,boolean isLifePrison) {
		super(type, cases);
		this.isLifePrison=isLifePrison;
	}
	
	public void display()
	{
		
		super.display();
		System.out.println("isLifePrison : "+isLifePrison);
	}

}
