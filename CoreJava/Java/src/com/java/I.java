package com.java;

public class I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyThread mt = new MyThread();
Thread t = new Thread(mt);
t.start();

}
}
class MyThreads implements Runnable {
	public void run() {
		System.out.println("hello");
	}
}