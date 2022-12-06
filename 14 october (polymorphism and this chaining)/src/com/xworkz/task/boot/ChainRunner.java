package com.xworkz.task.boot;

import com.xworkz.task.constructor.Chain;

public class ChainRunner {

	public static void main(String[] args) {

		Chain chain = new Chain();
		System.out.println("default or non parameterized Constructor...........");
		System.out.println("chain type : " + chain.type);
		System.out.println("chain price : " + chain.price + " rupees");
		System.out.println("chain length : " + chain.length + " feet");
		System.out.println("chain material : " + chain.material);
		System.out.println("chain weight : " + chain.weight + " gm");
		System.out.println("isStolen  : " + chain.isStolen);
		System.out.println("usedFor  : " + chain.usedFor);
		System.out.println("isFresh  : " + chain.isFresh);

		chain = new Chain("domestic",180 ,6.5d ,"steel" ,180d ,false , "dog chain",false );
		System.out.println("*******constructor with eight arguments************");
		System.out.println("chain type : " + chain.type);
		System.out.println("chain price : " + chain.price + " rupees");
		System.out.println("chain length : " + chain.length + " feet");
		System.out.println("chain material : " + chain.material);
		System.out.println("chain weight : " + chain.weight + " gm");
		System.out.println("isStolen  : " + chain.isStolen);
		System.out.println("usedFor  : " + chain.usedFor);
		System.out.println("isFresh  : " + chain.isFresh);
		System.out.println(System.lineSeparator());
		
		chain = new Chain("domestic",180 ,6.5d ,"steel" ,180d ,false , "dog chain");
		System.out.println("*******constructor with seven arguments************");
		System.out.println("chain type : " + chain.type);
		System.out.println("chain price : " + chain.price + " rupees");
		System.out.println("chain length : " + chain.length + " feet");
		System.out.println("chain material : " + chain.material);
		System.out.println("chain weight : " + chain.weight + " gm");
		System.out.println("isStolen  : " + chain.isStolen);
		System.out.println("usedFor  : " + chain.usedFor);
		System.out.println("isFresh  : " + chain.isFresh);
		System.out.println(System.lineSeparator());
		
		chain = new Chain("domestic",180 ,6.5d ,"steel" ,180d ,false );
		System.out.println("*******constructor with six arguments************");
		System.out.println("chain type : " + chain.type);
		System.out.println("chain price : " + chain.price + " rupees");
		System.out.println("chain length : " + chain.length + " feet");
		System.out.println("chain material : " + chain.material);
		System.out.println("chain weight : " + chain.weight + " gm");
		System.out.println("isStolen  : " + chain.isStolen);
		System.out.println("usedFor  : " + chain.usedFor);
		System.out.println("isFresh  : " + chain.isFresh);
		System.out.println(System.lineSeparator());
		
		chain = new Chain("domestic",180 ,6.5d ,"steel" ,180d );
		System.out.println("*******constructor with five arguments************");
		System.out.println("chain type : " + chain.type);
		System.out.println("chain price : " + chain.price + " rupees");
		System.out.println("chain length : " + chain.length + " feet");
		System.out.println("chain material : " + chain.material);
		System.out.println("chain weight : " + chain.weight + " gm");
		System.out.println("isStolen  : " + chain.isStolen);
		System.out.println("usedFor  : " + chain.usedFor);
		System.out.println("isFresh  : " + chain.isFresh);
		System.out.println(System.lineSeparator());
		
		chain = new Chain("domestic",180 ,6.5d ,"steel" );
		System.out.println("*******constructor with four arguments************");
		System.out.println("chain type : " + chain.type);
		System.out.println("chain price : " + chain.price + " rupees");
		System.out.println("chain length : " + chain.length + " feet");
		System.out.println("chain material : " + chain.material);
		System.out.println("chain weight : " + chain.weight + " gm");
		System.out.println("isStolen  : " + chain.isStolen);
		System.out.println("usedFor  : " + chain.usedFor);
		System.out.println("isFresh  : " + chain.isFresh);
		System.out.println(System.lineSeparator());
		
		chain = new Chain("domestic",180 ,6.5d);
		System.out.println("*******constructor with three arguments************");
		System.out.println("chain type : " + chain.type);
		System.out.println("chain price : " + chain.price + " rupees");
		System.out.println("chain length : " + chain.length + " feet");
		System.out.println("chain material : " + chain.material);
		System.out.println("chain weight : " + chain.weight + "grams");
		System.out.println("isStolen  : " + chain.isStolen);
		System.out.println("usedFor  : " + chain.usedFor);
		System.out.println("isFresh  : " + chain.isFresh);
		System.out.println(System.lineSeparator());
		
		chain = new Chain("domestic",180 );
		System.out.println("*******constructor with two arguments************");
		System.out.println("chain type : " + chain.type);
		System.out.println("chain price : " + chain.price + " rupees");
		System.out.println("chain length : " + chain.length + " feet");
		System.out.println("chain material : " + chain.material);
		System.out.println("chain weight : " + chain.weight + "grams");
		System.out.println("isStolen  : " + chain.isStolen);
		System.out.println("usedFor  : " + chain.usedFor);
		System.out.println("isFresh  : " + chain.isFresh);
		System.out.println(System.lineSeparator());
		
		chain = new Chain("domestic");
		System.out.println("*******constructor with one arguments************");
		System.out.println("chain type : " + chain.type);
		System.out.println("chain price : " + chain.price + " rupees");
		System.out.println("chain length : " + chain.length + " feet");
		System.out.println("chain material : " + chain.material);
		System.out.println("chain weight : " + chain.weight + "grams");
		System.out.println("isStolen  : " + chain.isStolen);
		System.out.println("usedFor  : " + chain.usedFor);
		System.out.println("isFresh  : " + chain.isFresh);
		System.out.println(System.lineSeparator());
		
		

	}

}
