package com.java;

import java.util.function.Function;

public class Function1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Function<Integer,Integer> f = a -> a*a;
Integer S = f.apply(5);
System.out.println(S);
	}

}