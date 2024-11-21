package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateStream {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,2,5,4);
		Set<Integer> duplicates = numbers.stream()
		.filter(n-> numbers.stream().filter(x->x.equals(n)).count()>1)
		.collect(Collectors.toSet());
		System.out.println(duplicates);
	}

}