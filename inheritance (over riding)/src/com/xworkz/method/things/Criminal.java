package com.xworkz.method.things;

public class Criminal {

	public String type;
	public int cases;

	public Criminal(String type, int cases) {
		super();
		this.type = type;
		this.cases = cases;
	}

	public void display()
	{
		System.out.println("type : "+type);
		System.out.println("cases : "+cases);
	}
}
