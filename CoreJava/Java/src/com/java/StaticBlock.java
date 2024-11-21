package com.java;

public class StaticBlock {
	  // First static block
    static {
        System.out.println("First static block");
    }

    // Static variable initialization
    static int staticVar;

    // Second static block
    static {
        staticVar = 10;
        System.out.println("Second static block: staticVar = " + staticVar);
    }

    // Third static block
    static {
        staticVar *= 2;
        System.out.println("Third static block: staticVar = " + staticVar);
    }

    public static void main(String[] args) {
        System.out.println("Main method: staticVar = " + staticVar);
    }

}
