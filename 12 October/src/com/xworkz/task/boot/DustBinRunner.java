package com.xworkz.task.boot;

import com.xworkz.task.constructor.DustBin;

public class DustBinRunner {

	public static void main(String[] args) {

		DustBin dustbin=new DustBin();
		System.out.println(dustbin.color);
		System.out.println(dustbin.type);
		System.out.println(dustbin.height);
		System.out.println(dustbin.garbageType);
		System.out.println(dustbin.shape);
		System.out.println(dustbin.function);
		System.out.println(dustbin.madeUpOf);
		System.out.println(dustbin.companyName);
		System.out.println(dustbin.Quantity);
		
		dustbin.design="flowerPrint";
		dustbin.wheeled=true;
		dustbin.mechanism="automatic";
		dustbin.trashlayout="double";
		dustbin.compartments=2;
		dustbin.namingStickers="recyclable";
		dustbin.garbageOdor="bad";
		dustbin.location="kitchen";
		dustbin.washable=true;
		dustbin.coversColor="black";
		
		System.out.println(dustbin.design);
		System.out.println(dustbin.wheeled);
		System.out.println(dustbin.mechanism);
		System.out.println(dustbin.trashlayout);
		System.out.println(dustbin.compartments);
		System.out.println(dustbin.namingStickers);
		System.out.println(dustbin.garbageOdor);
		System.out.println(dustbin.location);
		System.out.println(dustbin.washable);
		System.out.println(dustbin.coversColor);

	}

}
