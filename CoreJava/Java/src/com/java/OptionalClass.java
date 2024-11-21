package com.java;

import java.util.Optional;
import java.util.Scanner;

public class OptionalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Optiona o = new Optiona();
		Scanner sc = new Scanner(System.in);
		int userId = sc.nextInt();
		
		Optional<String> username = o.getUsername(userId);
		if(username.isPresent()) {
			String name = username.get();
			System.out.println(name.toUpperCase());
		}
		else {
			System.out.println("No Data");
		}
	}

}
class Optiona {
	public Optional<String> getUsername(Integer id) {
		String name = null;
		if(id == 100) {
			return Optional.of("Raju");
		}
		else if(id == 200) {
			return Optional.of("Ashu");
		}
		else if(id == 300) {
			return Optional.of("Aman");
		}
	
	return Optional.ofNullable(name);
	}
}