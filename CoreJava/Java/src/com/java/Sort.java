package com.java;

import java.util.Arrays;
import java.util.List;
//list=
//filter even and square
//summ all the no
//print
public class Sort {

	public static void main(String[] args) {
		
		
		List<Integer> list= Arrays.asList(1,5,4,6,2,1,7);
		int sum = list.stream().filter(n->n%2==0).mapToInt(n->n*n).sum();
		System.out.println(sum);
	}
}
