package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMapCollect {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Aman","Ashu","Nilesh","Chetan");
		List<String> nam = names.stream()
		.filter(name -> name.endsWith("n"))
		.map(String :: toLowerCase)
		.collect(Collectors.toList());
		System.out.println(nam);
	}

}
