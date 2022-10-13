package com.xworkz.task.boot;

import com.xworkz.task.constructor.DustBin;

public class DustBinRunner {

	public static void main(String[] args) {

		DustBin dustbin=new DustBin();
		System.out.println("color: "+dustbin.color);
		System.out.println("type: "+dustbin.type);
		System.out.println("height: "+dustbin.height);
		System.out.println("garbageType: "+dustbin.garbageType);
		System.out.println("shape: "+dustbin.shape);
		System.out.println("function: "+dustbin.function);
		System.out.println("madeUpOf: "+dustbin.madeUpOf);
		System.out.println("companyName: "+dustbin.companyName);
		System.out.println("Quantity: "+dustbin.Quantity);
		
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
		
		System.out.println("design: "+dustbin.design);
		System.out.println("is wheeled: "+dustbin.wheeled);
		System.out.println("mechanism: "+dustbin.mechanism);
		System.out.println("trashlayout: "+dustbin.trashlayout);
		System.out.println("namingStickers: "+dustbin.compartments);
		System.out.println("namingStickers: "+dustbin.namingStickers);
		System.out.println("garbageOdor: "+dustbin.garbageOdor);
		System.out.println("location: "+dustbin.location);
		System.out.println("washable: "+dustbin.washable);
		System.out.println("coversColor: "+dustbin.coversColor);

	}

}
