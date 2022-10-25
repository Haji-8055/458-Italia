package com.xworkz.declaring.boot;

import com.xworkz.declaring.things.ShirtBrand;

public class ShirtBrandRunner {

	public static void main(String[] args) {

		ShirtBrand shirtBrand = new ShirtBrand("maroon");
		shirtBrand.companyRevenue = 500000000000l;
		ShirtBrand.shirtPrice = 2500; // static
		shirtBrand.setBrandName();
		shirtBrand.display();

	}

}
