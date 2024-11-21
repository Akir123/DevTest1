package com.java;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class C {

	public static void main(String[] args) {
		C1 c = new C1();
		try {
			c.m1("C:\\Users\\Admin\\Desktop\\abc.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
class C1 {
	public void m1(String s) throws IOException {
		File f = new File("C:\\Users\\Admin\\Desktop\\abc.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("wow");
		bw.close();
	}
}