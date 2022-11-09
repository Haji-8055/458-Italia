package com.xworkz.method.things;

public class PoliticalParty {

	public String fullform;
	public String leader;

	public PoliticalParty(String fullform, String leader) {
		super();
		this.fullform = fullform;
		this.leader = leader;
	}
	
	public void display() {
		System.out.println("fullform : "+fullform);
		System.out.println("leader : "+leader);
	}
}
