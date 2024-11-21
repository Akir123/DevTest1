package com.java;

import java.io.Serializable;

public class Serialization {

	public static void main(String[] args) {
		Person p = new Person(23,"aman");
		System.out.println(p.getAge()+" "+p.getName());

	}

}
class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	private int age = 15;
	private String name = "aman";
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return name+" "+age;
	}
	
}