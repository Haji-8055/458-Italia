package com.xworkz.association.things;

public class Mountain {
	
	public String name;
	public double height;
	public Location location = new Location("Rudraprayag","uttarakhand", 246445, "India");

	

	public Mountain(String name) {
		
		this.name = name;

	}

	public void trecking(double height) {
		this.height = height;

	}

	public void showOff() {
		System.out.println("======printng details of mountain====");
		System.out.println("name of mountain : "+this.name);
		System.out.println("height of mountain : "+this.height);
		location.showOff();

	}


}
