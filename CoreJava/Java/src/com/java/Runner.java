package com.java;
//RotateMatrix
//1 2 3 
//4 5 6 
//7 8 9
//Rotated matrix:
//3 6 9 
//2 5 8 
//1 4 7
public class Runner {

	public static void main(String[] args) {
		
		int[][] ar= {{1,2,3},{4,5,6},{7,8,9}};
		int arr[][]	= new int[ar.length][ar.length];	
		for (int i = 0; i < ar.length; i++) {
			
			for (int j = 0; j < ar.length; j++) {
				arr[i][j]=ar[j][ar.length-1-i];
						
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int  j= 0; j < arr.length; j++) {
				
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
