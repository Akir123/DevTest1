package com.java;

import java.util.List;
import java.util.Arrays;

public class StreamAPI2 {

	public static void main(String[] args) {
		//List<Integer> list = Arrays.asList(12,54,67,98,76,45,66,33,23,22,55);
		//list.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.println(i));
		
		//System.out.println(".........................");
		List<String> list1 = Arrays.asList("aman","shubham","rohit","sonu","aman","rohit");
		//list1.stream().filter(i -> i.startsWith("s")).forEach(i -> System.out.println(i));
		list1.stream().distinct().forEach(i -> System.out.println(i));
		
	}

}