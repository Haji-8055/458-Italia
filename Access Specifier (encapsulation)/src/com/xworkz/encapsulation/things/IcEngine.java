package com.xworkz.encapsulation.things;

public class IcEngine {

	public String fullForm = "internal combustion engine";
	
	Engine engine = new Engine("Flat six engine", "Porsche", "naturally aspirated", true, 8000000,
			"turbo charged and NA", "v ,w,and boxer types ", "in drag cars", 870000, "Haji", "RaceTech india");

	public void use()
	 {
		  System.out.println("full form of ic : "+fullForm);

		  System.out.println(" name : " +engine.name);
		  System.out.println(" brand: " +engine.brand);
		  System.out.println(" engineType: " +engine.engineType);
		  System.out.println(" isGood: " +engine.isGood);
		  System.out.println(" price: " +engine.price);
		  System.out.println(" types: " +engine.types);
		  System.out.println(" model: " +engine.getModel());
		  System.out.println(" mostlyUsed: " +engine.getMostlyUsed());
		  System.out.println(" pricesOfModel : " +engine.getPricesOfModel());
		  System.out.println(" buyer: " +engine.getBuyer());
		  System.out.println(" supplier: " +engine.getSupplier());
		  
		  engine.setModel("turbo charged");
		  System.out.println("after modifying- model: " +engine.getModel());
		  
		  engine.setMostlyUsed("bmw");
		  System.out.println("after modifying- mostlyUsed: " +engine.getMostlyUsed());
		  
		  engine.setPricesOfModel(670000);
		  System.out.println(" after modifying- pricesOfModel : " +engine.getPricesOfModel());
		  
		  engine.setBuyer("furqan");
		  System.out.println("after modifying- buyer: " +engine.getBuyer());
		  
		  engine.setSupplier(" techart");
		  System.out.println("after modifying- supplier: " +engine.getSupplier());



		  

	 }
	
	
}
