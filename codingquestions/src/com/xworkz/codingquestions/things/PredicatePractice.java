package com.xworkz.codingquestions.things;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PredicatePractice {

	public static void main(String[] args) {

		Predicate<String> predicate = p -> p.startsWith("s");

		List<String> list = Arrays.asList("sam", "man", "sand", "red", "select");
		System.out.println(list);

		list = list.stream().filter(predicate).collect(Collectors.toList());
		System.out.println(list);
	}

}
