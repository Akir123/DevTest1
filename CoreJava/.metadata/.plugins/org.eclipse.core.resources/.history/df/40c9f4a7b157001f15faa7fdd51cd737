package com.java;

import java.util.Optional;
import java.util.Scanner;

public class OptionalClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Optio o = new Optio();
Scanner s = new Scanner(System.in);
int userAge = s.nextInt();
Optional<String> username = o.getUsername(userAge);
if(username.isPresent()) {
	String name = username.get();
	System.out.println(name.toUpperCase());
}
else {
	System.out.println("Data Not Found");
}
	}

}
class Optio {
public Optional<String> getUsername(Integer age) {
	String name = null;
	if(age == 20) {
		return Optional.of("adi");
	}
	else if(age == 40) {
		return Optional.of("ashu");
	}
	return Optional.ofNullable(name);
}
}