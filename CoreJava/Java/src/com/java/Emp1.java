package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Emp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emps> a = new ArrayList<Emps>();
		a.add(new Emps(1,"Adi",34,"M","Sales",2004,5));
		a.add(new Emps(2,"Madan",38,"M","Medicine",2034,10));
		a.add(new Emps(3,"Ravi",23,"M","Sales",2079,15));
		a.add(new Emps(4,"Kiran",16,"F","Tech",1765,20));
		a.add(new Emps(5,"Aman",46,"M","Sales",2034,9));
		a.add(new Emps(6,"Rohan",89,"M","Sales",4004,11));
		
		//java.util.Map<String, Long> map = a.stream().collect(Collectors.groupingBy(Emps::getGender,Collectors.counting()));
		//System.out.println(map);
		
		//a.stream().map(i -> i.dept).distinct().forEach(i -> System.out.println(i));
		
		//java.util.Map<String, Double> map = a.stream().collect(Collectors.groupingBy(Emps::getGender,Collectors.averagingDouble(Emps::getAge)));
		//System.out.println(map);
		
	   //Optional<Emps> o = a.stream().collect(Collectors.maxBy(Comparator.comparing(Emps::getSalary)));
	   //System.out.println(o.get());
		
		//a.stream().filter(i -> i.YOJ > 2015).map(Emps::getName).forEach(i -> System.out.println(i));
	//java.util.Map<String, Long> o = a.stream().collect(Collectors.groupingBy(Emps::getDept,Collectors.counting()));
	//System.out.println(o);
		
		//Optional<Emps> o = a.stream().collect(Collectors.maxBy(Comparator.comparing(i -> i.age)));
	//System.out.println(o.get());
		
Optional<Emps> o = a.stream().filter(i -> i.getGender().equals("M") && i.getDept().equals("Sales")).collect(Collectors.minBy(Comparator.comparing(i -> i.age)));
System.out.println(o.get());	
	}

}
class Emps {
	int id;
	String name;
	int age;
	String gender;
	String dept;
	int YOJ;
	double salary;
	public Emps(int id, String name, int age, String gender, String dept, int yOJ, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dept = dept;
		YOJ = yOJ;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getYOJ() {
		return YOJ;
	}
	public void setYOJ(int yOJ) {
		YOJ = yOJ;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emps [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", dept=" + dept + ", YOJ="
				+ YOJ + ", salary=" + salary + "]";
	}
	
}