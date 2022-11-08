package com.xworkz.casting.boot;

import com.xworkz.casting.things.*;

public class CourtRunner {

	public static void main(String[] args) {

		Court highCourt = new HighCourt();
		System.out.println(highCourt.name);
		System.out.println(highCourt.type);

		HighCourt highCourt1 = (HighCourt) highCourt; // casting
		System.out.println(highCourt1.highCourtCity);
		System.out.println(highCourt1.highCourtJudge);

		Court distCourt = new DistrictCourt();
		System.out.println(distCourt.name);
		System.out.println(distCourt.type);

		DistrictCourt distCourt1 = (DistrictCourt) distCourt;// casting
		System.out.println(distCourt1.distCourtCity);
		System.out.println(distCourt1.distCourtJudge);

		Court supCourt = new SupremeCourt();
		System.out.println(supCourt.name);
		System.out.println(supCourt.type);

		SupremeCourt supCourt1 = (SupremeCourt) supCourt;// casting
		System.out.println(supCourt1.supCourtCity);
		System.out.println(supCourt1.supCourtJudge);

	}

}
