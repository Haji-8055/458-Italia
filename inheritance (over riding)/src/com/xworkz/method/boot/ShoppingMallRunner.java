package com.xworkz.method.boot;

import com.xworkz.method.things.*;

public class ShoppingMallRunner {
	public static void main(String[] args) {

//		ShoppingMall mall=new Orion("Orion", "RajKumar Road", "Brigade Group"); --one way

		Orion mall = new Orion("Orion", "RajKumar Road", "Brigade Group");// another way
		mall.display();
	}

}
