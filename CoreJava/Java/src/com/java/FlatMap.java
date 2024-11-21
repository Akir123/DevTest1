package com.java;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
public class FlatMap {

	public static void main(String[] args) {
	List<List<String>> l = Arrays.asList(Arrays.asList("a","b","c"),Arrays.asList("d","e","f"));
	List<String> l1 = l.stream()
			.flatMap(List::stream)
			.collect(Collectors.toList());
	System.out.println(l1);
	}
	
}