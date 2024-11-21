package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckAlphabet {

	static String[][] seats = {{"a1_0","a2","a3"},{"b1","b2","b3"}};
	
	static List<String> getFreeSeats(){
		List<String> freeSeats = new ArrayList<String>();
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats.length; j++) {
				String ss=seats[i][j];
				if(ss.contains("0")) {
					freeSeats.add(ss);
				}
				
			}
		}
		return freeSeats;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getFreeSeats());

		
	}
}
