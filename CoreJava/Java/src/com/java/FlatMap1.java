package com.java;

import java.util.List;
import java.util.Arrays;

public class FlatMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> list = Arrays.asList("Java","Python","C++",".Net");
List<String> list1 = Arrays.asList("HTML","CSS","JAVASCRIPT");
List<List<String>> list2 = Arrays.asList(list,list1);

//list2.stream().flatMap(i -> i.stream()).forEach(i -> System.out.println(i));

list2.stream().forEach(i -> System.out.println(i));
	}

}