package com.java;

import java.util.stream.Stream;

public class StreamAPI3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u = new User(20,"aman");
		User u1 = new User(35,"charu");
		User u2 = new User(28,"maru");
		User u3 = new User(89,"garu");
		User u4 = new User(54,"adu");
		
		Stream<User> stream = Stream.of(u,u1,u2,u3,u4);
		stream.filter(i -> i.name.startsWith("a") && i.age > 20).forEach(i -> System.out.println(i));
	}

}
class User {
	int age;
	String name;
	
	public User(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + "]";
	}
	
}