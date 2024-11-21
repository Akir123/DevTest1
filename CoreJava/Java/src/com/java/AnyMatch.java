package com.java;

import java.util.Optional;
import java.util.stream.Stream;

public class AnyMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
People p1 = new People("AVINASH","INDIA");
People p2 = new People("BHAVESH","AUS");
People p3 = new People("NIKHIL","BRAZIL");
People p4 = new People("SONU","USA");
People p5 = new People("MONU","UK");

Stream<People> stream = Stream.of(p1,p2,p3,p4,p5);
//boolean b = stream.anyMatch(p -> p.country.equals("UK"));
//System.out.println(b);

Optional<People> find = stream.filter(i -> i.country.equals("UK")).findAny();
if(find.isPresent()) {
	System.out.println(find.get());
}
	}

}
class People {
	String name;
	String country;
	
	public People(String name, String country) {
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", country=" + country + "]";
	}
	
}