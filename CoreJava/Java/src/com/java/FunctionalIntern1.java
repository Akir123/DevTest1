package com.java;
public class FunctionalIntern1 {
	public static void main(String [] args) {
		FunctionalIntern f = (a,b) -> a * b;
	
		int x = f.add(2, 3);
		System.out.println(x);
	}
}
interface FunctionalIntern {
public int a = 20;
public int b = 30;
public int add(int a, int b);

}