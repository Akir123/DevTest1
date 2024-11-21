package com.java;

public class D {

	public static void main(String[] args) {
		D1 d = new D1();
		try {
		d.f1(0);
		}catch(Exception e) {
			System.out.println("wow");
			
		}

	}

}
class D1 {
	public void f1(int a) throws ArrayIndexOutOfBoundsException {
		int[]arr = {1,2,4};
		System.out.println(arr[5]);
	}
}