package com.java;

import java.util.List;

public class Arrays {
public static void main(String[]args) {
	int[]arr = {1,0,0,1,1,0,1,1,0,0,1,0,1,1,0,0,0,0,1,1,0};
	int temp = 0;
	for(int i = 0; i <= arr.length-1; i++) {
	for(int j = i+1; j <= arr.length-1; j++) {
		if(arr[i] > arr[j]) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	System.out.print(arr[i]+" ");
	
	}
	
}

}