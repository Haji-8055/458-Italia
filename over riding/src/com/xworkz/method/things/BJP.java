package com.xworkz.method.things;

public class BJP extends PoliticalParty {

	public String Symbol;

	public BJP(String fullform, String leader, String Symbol) {
		super(fullform, leader);
		this.Symbol = Symbol;
	}

	public void display()
	{
		super.display();
		System.out.println("symbol : "+Symbol);
	}
}
