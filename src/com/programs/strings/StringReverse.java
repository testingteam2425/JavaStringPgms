package com.programs.strings;

public class StringReverse {
	public static void main(String[] args) {
		String s2="mohan";
		String s1="";
		for (int i = s2.length()-1; i>=0; i--) {
			char c;
			c=s2.charAt(i);
			s1=s1+c;
			
			
		}
		System.out.println("the string is"+s1);
	}

}
