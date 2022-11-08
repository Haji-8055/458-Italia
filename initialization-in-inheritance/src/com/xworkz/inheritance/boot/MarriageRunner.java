package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.things.LegalMarriage;
//import com.xworkz.inheritance.things.Marriage;

public class MarriageRunner {

	public static void main(String[] args) {


		LegalMarriage shaadi = new LegalMarriage("arrange", "omkar", 150);

	//	Marriage shaadi1 = new LegalMarriage("arrange", "omkar", 150);

		System.out.println(shaadi.type);
		System.out.println(shaadi.groom);
		System.out.println(shaadi.members);
		
	}

}
