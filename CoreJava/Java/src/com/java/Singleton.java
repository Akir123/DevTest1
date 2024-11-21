package com.java;

public class Singleton {

	public static void main(String[] args) {
		Singleton1 singletonInstance1 = Singleton1.getInstance();
		Singleton1 singletonInstance2 = Singleton1.getInstance();
		
		System.out.println(singletonInstance1.hashCode());
		System.out.println(singletonInstance2.hashCode());
	}

}
class Singleton1 {
	private static Singleton1 instance;
	private Singleton1() {
		
	}
	public static Singleton1 getInstance() {
		if(instance ==null) {
			instance = new Singleton1();
		}
		return instance;
	}
}