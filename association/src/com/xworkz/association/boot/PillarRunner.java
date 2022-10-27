package com.xworkz.association.boot;

import com.xworkz.association.constants.PillarShapes;
import com.xworkz.association.things.Pillar;

public class PillarRunner {

	public static void main(String[] args) {

		Pillar pillar=new Pillar("P202", "navrang", PillarShapes.ROUND, 80, "metro Line");
		pillar.showOff();
	}

}
