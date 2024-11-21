package com.java;

import java.util.stream.Stream;

public class Users {

	public static void main(String[] args) {
		Users1 u1 = new Users1(10,"adi",3000);
		Users1 u2 = new Users1(20,"adi",77000);
		Users1 u3 = new Users1(10,"adi",56000);
		Users1 u4 = new Users1(10,"adi",2300);
		Users1 u5 = new Users1(10,"adi",10000);
		
		Stream<Users1> stream = Stream.of(u1,u2,u3,u4,u5);
		stream.filter(i -> i.emp_salary >= 50000).map(i -> i.emp_name+":"+i.emp_age+":"+i.emp_salary).forEach(i -> System.out.println(i));

	}

}
class Users1 {
	int emp_age;
	String emp_name;
	int emp_salary;
	public Users1(int emp_age, String emp_name, int emp_salary) {
		this.emp_name = emp_name;
		this.emp_age = emp_age;
		this.emp_salary = emp_salary;
	}
	@Override
	public String toString() {
		return "Users1 [emp_age=" + emp_age + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + "]";
	}
	
	
}