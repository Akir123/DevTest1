package com.java;

public class L {

	public static void main(String[] args) {
	L1 l = (a,b) -> System.out.println(a * b);
	l.m1(5, 9);

	}

}
interface L1 {
	public void m1(int a, int b);
	public default void m2() {
		System.out.println("hiii");
	}
	public static void m3() {
		System.out.println("hello");
	}
}

