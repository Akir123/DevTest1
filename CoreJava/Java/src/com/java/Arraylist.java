package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> a = new ArrayList<Integer>();
a.add(1);
a.add(5);
a.add(0);
a.add(3);

Collections.sort(a, new NumberComparator());
System.out.println(a);
System.out.println("......................");
Collections.sort(a, (i,j) -> (i > j) ? -1 : 1);
System.out.println(a);
System.out.println("........................");
a.forEach(i -> System.out.println(i));
	}
}
class NumberComparator implements Comparator<Integer> {

	public int compare(Integer i, Integer j) {
		if(i > j) {
			return -1;
		}
		else if(i < j) {
			return 1;
		}
		else {
			return 0;
		}
	}

}

