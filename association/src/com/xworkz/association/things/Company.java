package com.xworkz.association.things;

public class Company {

	public String name;
	public String type;

	public void showOff(String name, String type) {
		this.name = name;
		this.type = type;
		System.out.println("==printing details of pillar company==");
		System.out.println("name : " + name);
		System.out.println("type : " + type);

	}

}
