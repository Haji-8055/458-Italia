package com.xworkz.inheritance.things;

public class Marriage {
	
	public String type;
	public String groom;
	public int members;
	
	
	public Marriage(String type, String groom, int members) {
		this.type=type;
		this.groom=groom;
		this.members=members;
		
		System.out.println("parameterized constructor of Marriage(parent) class");
	}
	
	

}
