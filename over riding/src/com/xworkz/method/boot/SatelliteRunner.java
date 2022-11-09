package com.xworkz.method.boot;

import com.xworkz.method.things.Moon;

public class SatelliteRunner {

	public static void main(String[] args) {

		Moon moon=new Moon("IRS-1B", 1991, 384400D);
		moon.display();
	}

}
