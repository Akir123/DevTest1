package com.java;

public class R1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
		Runnable r = ()-> {
			for(int i = 1; i <= 5; i++) {
				System.out.println(i);
			}
		};
		Thread t1 = new Thread(r);
		t1.start();

}
}

