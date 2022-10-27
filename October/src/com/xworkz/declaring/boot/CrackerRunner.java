package com.xworkz.declaring.boot;

import com.xworkz.declaring.things.Cracker;

public class CrackerRunner {

	public static void main(String[] args) {

		Cracker phataake=new Cracker(4.0d);  // reference
		phataake.setUsedAt("festivals");
		phataake.price=950;
		Cracker.companyName="S.K";	//static
		phataake.display();
		
				


	}

}
