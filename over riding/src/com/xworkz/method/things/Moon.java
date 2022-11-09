package com.xworkz.method.things;

public class Moon extends Satellite {

	public double distFromEarth;

	public Moon(String name, int launchYear, double distFromEarth) {
		super(name, launchYear);
		this.distFromEarth = distFromEarth;
	}

	public void display() {
		super.display();
		System.out.println("distance From Earth : " + distFromEarth);
	}

}
