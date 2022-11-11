package com.xworkz.overriding.boot;

import com.xworkz.overriding.things.Venkateshwar;

public class PetrolBunkRunner {

	public static void main(String[] args) {

		Venkateshwar venki=new Venkateshwar(8562583455L);
		venki.display();
		venki.display("indian oil");// runtime polyMorphism
	}

}
