package com.java;

import java.util.stream.Stream;

public class ParallelStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stream<Integer> stream = Stream.of(1,2,3,4);
System.out.println("Serial Stream:");
//stream.forEach(i -> System.out.println(i));

System.out.println("Parallel Stream:");
stream.parallel().forEach(j -> System.out.println(j));
	}

}