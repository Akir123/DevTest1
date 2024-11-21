package com.java;

public class J {
	public static void main(String[] args) {
MyThreads1 my1 = new MyThreads1();
MyThreads1 my2 = new MyThreads1();
MyThreads1 my3 = new MyThreads1();
MyThreads1 my4 = new MyThreads1();

my1.setDaemon(true);
my1.start();
my2.start();
my3.start();
my4.start();

	}

}

class MyThreads1 extends Thread {
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("daemon thread");
		}
		else {
			System.out.println("user thread");
		}
	}
}