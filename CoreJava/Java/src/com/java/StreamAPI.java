package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamAPI {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave", "Eve");

		// Filter names starting with 'A' and convert to uppercase
		List<String> result = names.stream()
		    .filter(name -> name.startsWith("A"))
		    .map(String::toUpperCase)
		    .collect(Collectors.toList());

		System.out.println(result);
	
	}

}
