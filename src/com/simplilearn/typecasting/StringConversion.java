package com.simplilearn.typecasting;

public class StringConversion {
	public static void main(String[] args) {
	
	String price = "100";

	int priceInt  = Integer.parseInt(price);

	System.out.println("String value: "+price);

	System.out.println("Int value :"+priceInt);

	int num = 10;

	String data = String.valueOf(num);

	System.out.println("The String value :"+data);
	}

}
