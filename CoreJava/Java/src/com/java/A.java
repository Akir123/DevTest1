package com.java;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class A {
public static void main(String[] args) {
		        String s = "C:\\Users\\Admin\\Desktop\\abc.txt";
		        File f = null;
		        FileWriter fw = null;
		        BufferedWriter bw = null;
		        try {
		            f = new File(s);
		            fw = new FileWriter(f);
		            bw = new BufferedWriter(fw);
		            bw.write("I am Happy\nReally am i ?");
		        } catch (IOException i) {
		            i.printStackTrace();
		        } finally {
		            try {
		                if (bw != null) {
		                    bw.close();
		                }
		                if (fw != null) {
		                    fw.close();
		                }
		            } catch (IOException e) {
		                e.printStackTrace();
		            }
		        
		    }
		

		
	}

}
