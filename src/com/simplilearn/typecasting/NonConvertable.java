package com.simplilearn.typecasting;

public class NonConvertable {
	
	public static void main(String[] args) {
		
		char firstCharacter = 'c';

		int number = 100;

		firstCharacter = (char) number;

		System.out.println(firstCharacter);


	}

}
