package com.java;

public class UppercaseTOLowercase {

	public static void main(String[] args) {
		String s = "MayUr@23DhoPte";
	char[] c = s.toCharArray();
	for(int i = 0; i <= s.length()-1; i++) {
		char ch = c[i];
		if(c[i] % 2 == 0 && ch >= 'A' && ch <= 'Z') {
			c[i] = (char)(ch+32);
		}
		else if(c[i] % 2 == 1 && ch >= 'a' && ch <= 'z') {
			c[i] = (char)(ch-32);
		}

	System.out.print(c[i]);
		}
	}

}