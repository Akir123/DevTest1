package com.java;

import java.util.Arrays;

public class DuplicateElement {

	public static void main(String[] args) {
		int[]arr = {1,23,65,65,78,34,23,1,34,56,56,78,78};
		for(int i = 0; i <= arr.length-1; i++) {
		for(int j = i+1; j <= arr.length-1; j++) {
			if(arr[i] == arr[j]) {
				System.out.println(arr[i]);
				break;
				}
			}
		}

	}

}
