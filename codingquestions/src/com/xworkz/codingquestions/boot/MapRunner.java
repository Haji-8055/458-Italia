package com.xworkz.codingquestions.boot;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {

		
		CountryDTO countryDTO1=new CountryDTO(1, "india");
		CountryDTO countryDTO2=new CountryDTO(2, "russia");
		
		PresidentDTO presidentDTO1 = new PresidentDTO(1, "murmu");
		PresidentDTO presidentDTO2 = new PresidentDTO(1, "putin");
		
		
		Map<CountryDTO, PresidentDTO> map=new HashMap<CountryDTO, PresidentDTO>();
		map.put(countryDTO1, presidentDTO1);
		map.put(countryDTO2, presidentDTO2);
		
		System.out.println("==printng entryset=============");
		map.forEach((c,p)->System.out.println(c+" : "+p));

		
		System.out.println("\n printng keys=============");
		map.keySet().forEach(c-> System.out.println(c));
		
		System.out.println("\n printng values=============");
		map.values().forEach(p->System.out.println(p));
		
		
	}

}
