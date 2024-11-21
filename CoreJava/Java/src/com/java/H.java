package com.java;

public class H {

	public static void main(String[] args) {
	MyThread m = new MyThread();
	Thread t = new Thread(m);
	t.start();

	}

}
class MyThread extends Thread {
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i+ " user thread");
		}
	}
}