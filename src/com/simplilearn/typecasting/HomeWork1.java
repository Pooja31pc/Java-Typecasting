package com.simplilearn.typecasting;

import java.util.Scanner;

public class HomeWork1 {
	
	public static void main(String[] args) {
	
	// WAP to take user input as int value and convert 
			// into float, double and byte.
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the value: ");
	
	int userValue = input.nextInt();
	System.out.println("the int value is: "+userValue);
	
	float userValueF = userValue;
	System.out.println("the float value is: "+userValueF);
	
	double userValueD = userValueF;
	System.out.println("the double value is: "+userValueD);
	
	byte userValueB = (byte) userValueD;
	System.out.println("the byte value is: "+userValueB);
	
	}

}
