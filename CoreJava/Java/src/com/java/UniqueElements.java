package com.java;

import java.util.Arrays;

public class UniqueElements {

	public static void main(String[] args) {
		int[]arr = {12,54,67,87,90,87,54,45,65,34,12,67,90,45};
		int count = 0;
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] != arr[i+1]) {
				arr[i] = count;
				count++;
			}
		}
		
		arr[count++] = arr[arr.length-1];
		
		int[]arr1 = new int[count];
		
		for(int i = 0; i < count; i++) {
			arr1[i] = arr[i];
	
		}
		System.out.println(Arrays.toString(arr1));
	}

}
