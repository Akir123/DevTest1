package com.java;

public class P {

	public static void main(String[] args) {
		Q q = new Q();
		q.setMethod(200);
		int x = q.getMethod();
		System.out.println(x);

	}

}
class Q {
	private int a = 10;
	private String b = "aman";
	
	public void setMethod(int a) {
		this.a = a;
	}
	public int getMethod() {
		return a;
	}
}