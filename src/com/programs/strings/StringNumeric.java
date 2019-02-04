package com.programs.strings;

public class StringNumeric {
	public static void main(String[] args) {
		String s1="mohan1234";
		String s2=" ";
		for (int i = 0; i<s1.length(); i++) {

			char c=s1.charAt(i);
			if (Character.isDigit(c)) {


				s2=s2+c;

			}
			
			
			

		}




		System.out.println("the string is"+s2);

	}
}