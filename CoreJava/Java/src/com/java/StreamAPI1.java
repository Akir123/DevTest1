package com.java;

import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;
public class StreamAPI1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,78,98,56,43,22,34,2,65,4,1,45,87);
		//Stream<Integer> stream = list.stream();
		//Stream<Integer> filter = stream.filter(i -> i < 20);
		//filter.forEach(i -> System.out.println(i));
		
		list.stream().filter(i -> i < 20).forEach(i -> System.out.println(i));
	}

}