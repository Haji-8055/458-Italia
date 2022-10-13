package com.xworkz.task.boot;

import com.xworkz.task.constructor.Tea;

public class TeaRunner {
	
		public static void main(String[] args) {
			
			Tea tea=new Tea();
			System.out.println("values assigned using literals");
			System.out.println("brand: "+tea.brand);
			System.out.println("name: "+tea.name);
			System.out.println("type: "+tea.type);
			System.out.println("price: "+tea.price);
			System.out.println("quantity: "+tea.quantity);
			System.out.println("packagingMaterial: "+tea.packagingMaterial);
			System.out.println("bestBefore: "+tea.bestBefore);
			System.out.println("manufacturingYear: "+tea.manufacturingYear);
			System.out.println("cultivatedIn: "+tea.cultivatedIn);
			System.out.println("is packed: "+tea.packed);
			
			System.out.println("---------------------------------------- ");
			System.out.println("values assigned using instantiation");
			tea.specialIngredient="ginger";
			tea.preparingProcedures=4;
			tea.color="black";
			tea.companyFounder="James Finlay";
			tea.physicalProperty="granules";
			tea.appearance="dry";
		    tea.mostConsumingAt="turkey";		
			
		    System.out.println("is fermented: "+tea.fermented);
			System.out.println("specialIngredient: "+tea.specialIngredient);
			System.out.println("preparingProcedures: "+tea.preparingProcedures);
			System.out.println("color: "+tea.color);
			System.out.println("companyFounder: "+tea.companyFounder);
			System.out.println("physicalProperty: "+tea.physicalProperty);
			System.out.println("appearance: "+tea.appearance);
			System.out.println("mostConsumingAt: "+tea.mostConsumingAt);
			
		   
			
			
			
		

		}

	}



