package com.java;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
S s = new S();
s.m1(0);
s.m1();
	}

}
class R {
	final void m1() {
		System.out.println("hi");
	}
}
class S extends R {
	final void m1(int a) {
		System.out.println("hello");
	}
}