package com.java;

import java.util.Arrays;

public class G {

	public static void main(String[] args) {
		int[]arr = {12,45,8,657,0,86,64,23};
		int temp = 0;
		for(int i = 0; i <= arr.length-1; i++) {
			for(int j = 0; j <= arr.length-1; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}	
			}
		
		}
		System.out.println(Arrays.toString(arr));
	}

}
