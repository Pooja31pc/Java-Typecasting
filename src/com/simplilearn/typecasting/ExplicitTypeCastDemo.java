package com.simplilearn.typecasting;

public class ExplicitTypeCastDemo {
	
	public static void main(String[] args) {
		
		double price = 100.49;
		long priceLong = (long) price;
		int priceInt = (int) priceLong;
		byte priceByte = (byte) priceInt;
		
		System.out.println("Double Price Vlaue :"+price);
		System.out.println("Long Price Vlaue :"+priceLong);
		System.out.println("Int Price Vlaue :"+priceInt);
		System.out.println("Byte Price Vlaue :"+priceByte);
	}

}
