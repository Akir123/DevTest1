package com.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class B {

	public static void main(String[] args) {
		String s = "C:\\Users\\Admin\\Desktop\\abc.txt";
		File f = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			f = new File(s);
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String str = br.readLine();
			System.out.println(str);
		}
	catch(IOException e) {
		e.printStackTrace();
	}
		finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
