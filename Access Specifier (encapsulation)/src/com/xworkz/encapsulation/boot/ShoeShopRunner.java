package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.things.Shoe;
import com.xworkz.encapsulation.things.ShoeShop;

public class ShoeShopRunner {
	public static void main(String[] args) {

		Shoe shoe = new Shoe("nike", 8, "casual", "mumbai", "fabric plastic", "red", "shubam", true, 18000, 2025);
		ShoeShop shop = new ShoeShop();

		shop.use();

		System.out.println(System.lineSeparator());
		System.out.println("reading shoe class properties in main method using getter method ");

		System.out.println("shopName " + shop.shopName);
		System.out.println("Material : " + shoe.getMaterial());
		System.out.println("Color : " + shoe.getColor());
		System.out.println("Owner : " + shoe.getOwner());
		System.out.println("Price : " + shoe.getPrice());
		System.out.println("Validity : " + shoe.getValidity());
		System.out.println("Comfort : " + shoe.isComfort());

	}

}
