package com.java;

import java.util.function.Predicate;

public class Predicate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p = i -> i >= 10;
		System.out.println(p.test(8));
	}

}