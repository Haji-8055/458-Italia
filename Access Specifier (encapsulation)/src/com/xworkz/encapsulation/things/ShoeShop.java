package com.xworkz.encapsulation.things;

public class ShoeShop {

	public String shopName = "renuka";

	Shoe shoe = new Shoe("nike", 8, "casual", "mumbai", "fabric plastic", "red", "shubam", true, 18000, 2025);

	public void use() {
		System.out.println("shopName " + shopName);
		System.out.println("shoe brand " + this.shoe.brand);
		System.out.println("shoe size " + this.shoe.size);
		System.out.println("shoe type " + this.shoe.type);
		System.out.println("shoe shoeCompanyLocation " + this.shoe.shoeCompanyLocation);

		System.out.println("shoe famous " + shoe.famous);
		System.out.println("shoe brandAmbassador " + shoe.brandAmbassador);
		System.out.println("shoe shoeCompanyRevenue " + shoe.shoeCompanyRevenue);
		System.out.println("Material : " +shoe.getMaterial());
		System.out.println("Color : " +shoe.getColor());
		System.out.println("Owner : " +shoe.getOwner());
		System.out.println("Price : " +shoe.getPrice());
		System.out.println("Validity : " +shoe.getValidity());
		System.out.println("Comfort : " +shoe.isComfort());
		

		shoe.setMaterial("blown rubber");
		System.out.println("modifying material using setter method  : "+shoe.getMaterial());

		shoe.setColor("white");
		System.out.println("modifying Color using setter method  : "+shoe.getColor());

		shoe.setOwner("robin");
		System.out.println("modifying Owner using setter method  : "+shoe.getOwner());

		shoe.setPrice(8000);
		System.out.println("modifying Price using setter method  : "+shoe.getPrice());

		shoe.setValidity(8);
		System.out.println("modifying Validity using setter method  : "+shoe.getValidity());

		shoe.setComfort(true);
		System.out.println("modifying isComfort using setter method  : "+shoe.isComfort());

	}

}
