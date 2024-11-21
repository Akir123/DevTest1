package com.java;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee3 e1 = new Employee3("Aman",50000);
		Employee3 e2 = new Employee3("Rahul",70000);
		Employee3 e3 = new Employee3("Chetan",70000);
		Employee3 e4 = new Employee3("Kunal",100000);
		Employee3 e5 = new Employee3("Sunil",70000);
		
		Stream<Employee3> stream = Stream.of(e1,e2,e3,e4,e5);
		//Optional<Employee3> max = stream.collect(Collectors.maxBy(Comparator.comparing(i -> i.salary)));
		//System.out.println("max salary is : "+ max.get());
		
		//Optional<Employee3> min = stream.collect(Collectors.minBy(Comparator.comparing(i -> i.salary)));
		//System.out.println("min salary is : "+ min.get());
		
		//Double avg = stream.collect(Collectors.averagingDouble(i -> i.salary));
		//System.out.println("avg salary is : "+ avg);
		
		java.util.Map<Object, List<Employee3>> data = stream.collect(Collectors.groupingBy(i -> i.salary));
	System.out.println(data);
	}

}
class Employee3 {
	String name;
	int salary;
	public Employee3(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee3 [name=" + name + ", salary=" + salary + "]";
	}
	
}