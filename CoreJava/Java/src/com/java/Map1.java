package com.java;

import java.util.List;
import java.util.Arrays;

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("adi","rahul","aman","shubham");
		list.stream().filter(i -> i.startsWith("a")).map(i -> i +"="+i.length()).forEach(i -> System.out.println(i));
System.out.println("...................");
		
		list.stream().map(i -> i+":"+i.length()).forEach(i -> System.out.println(i));

	}

}
