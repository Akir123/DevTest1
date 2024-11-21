package in.ashokit;

public class Palindrome {
	 public boolean PorN(String s) {
	        String s1 = "";
	        int length = s.length();
	        for (int i = length - 1; i >= 0; i--) {
	            s1 = s1 + s.charAt(i);
	        }
	        return s.equals(s1);
	    }
}
