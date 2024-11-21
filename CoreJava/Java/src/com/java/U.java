package com.java;

public class U {
	public static void main(String[]args) {
	String s = "MayUr@23DhoPte";
	for(int i = 0; i < s.length(); i++) {
		char ch = s.charAt(i);
		if(ch=='@'|| ch=='2'|| ch=='3') {
			ch = (char) (ch-1);
		}
	}
	}

}
