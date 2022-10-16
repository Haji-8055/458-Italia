package com.xworkz.task.boot;

import com.xworkz.task.constructor.TextileShop;

public class TextileShopRunner {

	public static void main(String[] args) {
		
		TextileShop shop = new TextileShop();
		System.out.println("default or non parameterized Constructor...........");
		System.out.println("ownerName: " + shop.ownerName);
		System.out.println("ownerwifeName: " + shop.ownerwifeName);
		System.out.println("ownerDaughterName: " + shop.ownerDaughterName);
		System.out.println("ownerDaughterNumber: " + shop.ownerDaughterNumber);
		System.out.println("ownerNoOfWives: " + shop.ownerNoOfWives);
		System.out.println("shopNo: " + shop.shopNo);
		System.out.println("contactNo: " + shop.contactNo);

		System.out.println(System.lineSeparator());
		shop = new TextileShop("Suhel","someone","to be named",856425375L,2,41,6362856452L);
		System.out.println("*******constructor with seven arguments************");
		System.out.println("ownerName: " + shop.ownerName);
		System.out.println("ownerwifeName: " + shop.ownerwifeName);
		System.out.println("ownerDaughterName: " + shop.ownerDaughterName);
		System.out.println("ownerDaughterNumber: " + shop.ownerDaughterNumber);
		System.out.println("ownerNoOfWives: " + shop.ownerNoOfWives);
		System.out.println("shopNo: " + shop.shopNo);
		System.out.println("contactNo: " + shop.contactNo);
		
		System.out.println(System.lineSeparator());
		shop = new TextileShop("Ganesh","searching","not married yet",0,2,41);
		System.out.println("*******constructor with 6 arguments************");
		System.out.println("ownerName: " + shop.ownerName);
		System.out.println("ownerwifeName: " + shop.ownerwifeName);
		System.out.println("ownerDaughterName: " + shop.ownerDaughterName);
		System.out.println("ownerDaughterNumber: " + shop.ownerDaughterNumber);
		System.out.println("ownerNoOfWives: " + shop.ownerNoOfWives);
		System.out.println("shopNo: " + shop.shopNo);
		System.out.println("contactNo: " + shop.contactNo);

		System.out.println(System.lineSeparator());
		shop = new TextileShop("puneeth","laxmi","Sneha",9685342156L,1);
		System.out.println("*******constructor with five arguments************");
		System.out.println("ownerName: " + shop.ownerName);
		System.out.println("ownerwifeName: " + shop.ownerwifeName);
		System.out.println("ownerDaughterName: " + shop.ownerDaughterName);
		System.out.println("ownerDaughterNumber: " + shop.ownerDaughterNumber);
		System.out.println("ownerNoOfWives: " + shop.ownerNoOfWives);
		System.out.println("shopNo: " + shop.shopNo);
		System.out.println("contactNo: " + shop.contactNo);

		System.out.println(System.lineSeparator());
		shop = new TextileShop("Ravi","ragini","neha",8245672412L);
		System.out.println("*******constructor with four arguments************");
		System.out.println("ownerName: " + shop.ownerName);
		System.out.println("ownerwifeName: " + shop.ownerwifeName);
		System.out.println("ownerDaughterName: " + shop.ownerDaughterName);
		System.out.println("ownerDaughterNumber: " + shop.ownerDaughterNumber);
		System.out.println("ownerNoOfWives: " + shop.ownerNoOfWives);
		System.out.println("shopNo: " + shop.shopNo);
		System.out.println("contactNo: " + shop.contactNo);

		System.out.println(System.lineSeparator());
		shop = new TextileShop("Ravi","ragini",8245672412L);
		System.out.println("*******constructor with two string and 1 long arguments************");
		System.out.println("ownerName: " + shop.ownerName);
		System.out.println("ownerwifeName: " + shop.ownerwifeName);
		System.out.println("ownerDaughterName: " + shop.ownerDaughterName);
		System.out.println("ownerDaughterNumber: " + shop.ownerDaughterNumber);
		System.out.println("ownerNoOfWives: " + shop.ownerNoOfWives);
		System.out.println("shopNo: " + shop.shopNo);
		System.out.println("contactNo: " + shop.contactNo);

		System.out.println(System.lineSeparator());
		shop = new TextileShop("puneeth","laxmi","Sneha");
		System.out.println("*******constructor with three string arguments************");
		System.out.println("ownerName: " + shop.ownerName);
		System.out.println("ownerwifeName: " + shop.ownerwifeName);
		System.out.println("ownerDaughterName: " + shop.ownerDaughterName);
		System.out.println("ownerDaughterNumber: " + shop.ownerDaughterNumber);
		System.out.println("ownerNoOfWives: " + shop.ownerNoOfWives);
		System.out.println("shopNo: " + shop.shopNo);
		System.out.println("contactNo: " + shop.contactNo);

		System.out.println(System.lineSeparator());
		shop = new TextileShop("Pavan","Prema");
		System.out.println("*******constructor with two argument************");
		System.out.println("ownerName: " + shop.ownerName);
		System.out.println("ownerwifeName: " + shop.ownerwifeName);
		System.out.println("ownerDaughterName: " + shop.ownerDaughterName);
		System.out.println("ownerDaughterNumber: " + shop.ownerDaughterNumber);
		System.out.println("ownerNoOfWives: " + shop.ownerNoOfWives);
		System.out.println("shopNo: " + shop.shopNo);
		System.out.println("contactNo: " + shop.contactNo);

		System.out.println(System.lineSeparator());
		shop = new TextileShop("Furqan");
		System.out.println("*******constructor with one argument************");
		System.out.println("ownerName: " + shop.ownerName);
		System.out.println("ownerwifeName: " + shop.ownerwifeName);
		System.out.println("ownerDaughterName: " + shop.ownerDaughterName);
		System.out.println("ownerDaughterNumber: " + shop.ownerDaughterNumber);
		System.out.println("ownerNoOfWives: " + shop.ownerNoOfWives);
		System.out.println("shopNo: " + shop.shopNo);
		System.out.println("contactNo: " + shop.contactNo);

	}

}
