package com.xworkz.overriding.things;

public class PetrolBunk {

	public long phoneNo;
	public String company;

	public PetrolBunk(long phoneNo) {
		super();
		this.phoneNo = phoneNo;
	}

	public void display() {
		System.out.println("phoneNo : " + phoneNo);
	}

	public void display(String company) {// runtime polyMorphism
		this.company = company;
		System.out.println("company : " + company);

	}
}
