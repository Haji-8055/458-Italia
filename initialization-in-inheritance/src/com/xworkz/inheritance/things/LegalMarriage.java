package com.xworkz.inheritance.things;

public class LegalMarriage extends Marriage {

	public LegalMarriage(String type, String groom, int members) {
		super(type, groom, members);
		System.out.println("parameterized constructor of child class");

	}

}
