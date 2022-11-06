package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.things.Engine;
import com.xworkz.encapsulation.things.IcEngine;

public class IcEngineRunner {

	public static void main(String[] args) {
		
		IcEngine ic=new IcEngine();
		ic.use();

		Engine engine = new Engine("Flat six engine", "Porsche", "naturally aspirated", true, 8000000,
				"turbo charged and NA", "v ,w,and boxer types ", "in drag cars", 870000, "Haji", "RaceTech india");

		System.out.println(System.lineSeparator());
		System.out.println("reading engine class properties in main method using getter method ");

		System.out.println(" model: " +engine.getModel());
		System.out.println(" mostlyUsed: " +engine.getMostlyUsed());
		System.out.println(" pricesOfModel : " +engine.getPricesOfModel());
		System.out.println(" buyer: " +engine.getBuyer());
		System.out.println(" supplier: " +engine.getSupplier());
	}

}
