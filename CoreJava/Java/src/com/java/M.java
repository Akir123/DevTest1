package com.java;

public class M {

	public static void main(String[] args) {
		N1 n = new N1(20,"amina");
		System.out.println(n.a+" "+n.b);
		

	}

}
class M1 {
	int a = 10;
	String b = "amina";
	public M1(int a, String b) {
		this.a = a;
		this.b = b;
	}
}
class N1 extends M1 {
	public N1(int a, String b) {
		super(a,b);
	}
}