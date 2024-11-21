package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

	public static void main(String[] args) {
	List<String> a = Arrays.asList("hello","world");
	List<String> a1 = a.stream()
			 		   .map(String::toUpperCase)
			 		   .collect(Collectors.toList());
	System.out.println(a1);

	}

}
