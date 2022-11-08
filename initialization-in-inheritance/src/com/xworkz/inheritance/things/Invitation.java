package com.xworkz.inheritance.things;

public class Invitation {

	public String type;
	public String inviter;
	public boolean isGood;

	public Invitation(String type, String inviter, boolean isGood) {
		
		System.out.println("parameterized constructor of Invitation(parent) class");
		this.type = type;
		this.inviter = inviter;
		this.isGood = isGood;
	}

}
