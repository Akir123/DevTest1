package com.java;

public class FunctionalInt {

	public static void main(String[] args) {
		Adi a = n -> System.out.println("result");
		a.m(0);
		a.m1();
		Adi.m2();
		
		

	}

}

interface Adi {
	public void m(int n);
	
	public default void m1() {
		System.out.println("bye");
	}
	public static void m2() {
		System.out.println("hiiii");
	}
}