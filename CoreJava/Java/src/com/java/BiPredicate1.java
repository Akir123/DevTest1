package com.java;

import java.util.function.BiPredicate;


public class BiPredicate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<String,String> p = (i,j) -> i==j;
		System.out.println(p.test("a", "b"));
	}

}
