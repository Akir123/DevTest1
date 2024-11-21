package com.java;

import java.util.Arrays;

public class ThirdHighestValue {

	public static void main(String[] args) {
		int[]arr = {23,76,45,87,44,22,4,6,87,34,6,32,756,87};
		int count  = 0;
		for(int i = 0; i <= arr.length-1; i++) {
		 for(int j = i +1; j <= arr.length-1; j++) {
			 if(arr[i] < arr[j]) {
				 count = arr[i];
				 arr[i] = arr[j];
				 arr[j] = count;
			 }
		 }
		 System.out.println(arr[2]);
		 break;
		}
	}

}
