package com.java;

import java.util.function.Supplier;

public class Supplier1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Integer> s = ()-> 10*10;
		Integer s1 = s.get();
		System.out.println(s1);
		
	}

}