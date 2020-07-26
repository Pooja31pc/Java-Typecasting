package com.simplilearn.typecasting;

import java.util.Scanner;

public class TypeConversionBasedOnUser {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number 1 -100 : ");

		String userNumber = input.nextLine();


		int userIntValue  = Integer.parseInt(userNumber);

		double userDoubleValue  = Double.parseDouble(userNumber);

		long userLongValue  = Long.parseLong(userNumber);

		System.out.println("User Input as Interger : "+userIntValue);
		System.out.println("User Input as Double : "+userDoubleValue);
		System.out.println("User Input as Long : "+userLongValue);

	}

}
