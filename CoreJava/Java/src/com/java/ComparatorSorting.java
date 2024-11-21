package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorSorting {

	public static void main(String[] args) {
		ArrayList<Employee1> a = new ArrayList<Employee1>();
a.add(new Employee1(194,"chetan"));
a.add(new Employee1(6,"man"));
a.add(new Employee1(68,"nan"));
a.add(new Employee1(2,"san"));
Collections.sort(a, Comparator.comparingDouble(Employee1::getSalary).reversed());
for(Employee1 e : a) {
	System.out.println(e);
}
}
}

class Employee1 {
	private double salary;
	private String name;
	public Employee1(double salary, String name) {
		this.salary = salary;
		this.name= name;
	}
	public double getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	
	public String toString() {
		return salary +":"+name;
	}
}