package com.xworkz.codingquestions.boot;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {

		List<Integer> number = Arrays.asList(2, 3, 4, 5);

		// demonstration of map method
		List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());

		System.out.println(square);

		List<String> names = Arrays.asList("Reflection", "Collection", "Stream","SuperCar");

		// demonstration of filter method
		List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());

		System.out.println(result);
	}
}
