package com.xworkz.declaring.boot;

import com.xworkz.declaring.things.Sweet;

public class SweetRunner {

	public static void main(String[] args) {

		Sweet sweet = new Sweet(480);
		sweet.setQuantity(250);
		Sweet.color = "orange"; // static
		sweet.shopName = "Mishra";
		sweet.display();

	}

}
