package com.java;

public class Amy {

	public static void main(String[] args) {
		Bi b1 = new Bi(10,20);
		System.out.println(b1.a + " "+b1.b);
	}

}
class Ai {
	int a = 10;
	int b = 20;
	public Ai(int a, int b) {
		this.a = a;
		this.b = b;
	}
}
class Bi extends Ai {
	public Bi(int a, int b) {
		super(a,b);
	}
}