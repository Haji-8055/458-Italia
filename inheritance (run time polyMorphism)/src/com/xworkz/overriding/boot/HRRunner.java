package com.xworkz.overriding.boot;

import com.xworkz.overriding.things.Akshara;

public class HRRunner {

	public static void main(String[] args) {

		Akshara aksh =new Akshara(25);
		aksh.display();
		aksh.display("xworkz");// runtime polyMorphism
		
	}

}
