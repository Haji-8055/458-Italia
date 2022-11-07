package com.xworkz.casting.boot;

import com.xworkz.casting.things.*;

public class CourtRunner {
	
	public static void main(String[] args) {
		
		Court court=new HighCourt();
		System.out.println(court.name);
		System.out.println(court.type);
		
		HighCourt highCourt=(HighCourt) court; 
		System.out.println(highCourt.highCourtCity);
		System.out.println(highCourt.highCourtJudge);
		
		
	}

}
