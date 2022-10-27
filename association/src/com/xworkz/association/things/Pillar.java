package com.xworkz.association.things;

import com.xworkz.association.constants.PillarShapes;

public class Pillar {

	public String id;
	public String place;
	public PillarShapes shape;
	public int height;
	public String supporting;

	Company company = new Company();

	public Pillar(String id, String place, PillarShapes shape, int height, String supporting) {
		this.id = id;
		this.place = place;
		this.shape = shape;
		this.height = height;
		this.supporting = supporting;
	}

	public void showOff() {

		System.out.println("==printing details of pillar==");
		System.out.println("id : " + id);
		System.out.println("place : " + place);
		System.out.println("shape : " + shape);
		System.out.println("height : " + height);
		System.out.println("supporting : " + supporting);
		company.showOff("BBMP", "government");

	}

}
