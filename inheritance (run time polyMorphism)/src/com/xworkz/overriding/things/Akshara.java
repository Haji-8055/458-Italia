package com.xworkz.overriding.things;

public class Akshara extends HR {

	public Akshara(int age) {
		super(age);
	}

	@Override
	public void display(String name) {// runtime polyMorphism
		super.display(name);

	}

}
