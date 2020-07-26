package com.simplilearn.typecasting;

import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {
	
	// WAP for taking user Input as string
			// Integer Byte Float and Double
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value: ");
		
		String userInputS = scan.nextLine();
		System.out.println("user string input is: "+userInputS);
		
		int userInputI = Integer.parseInt(userInputS);
		System.out.println("user integer input is: "+userInputI);
		
		float userInputF  = Float.parseFloat(userInputS);
		System.out.println("user float input is: "+userInputF);
		
		double userInputD  = Double.parseDouble(userInputS);
		System.out.println("user double input is: "+userInputD);
		
		
		byte userInputB  = Byte.parseByte(userInputS);
		System.out.println("user byte input is: "+userInputB);
	
	}
}
