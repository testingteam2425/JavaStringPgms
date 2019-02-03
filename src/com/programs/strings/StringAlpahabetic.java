package com.programs.strings;

public class StringAlpahabetic {
	public static void main(String[] args) {
		String s5="sgk2425";
		for (int i = 0; i <s5.length(); i++) {
			char c=s5.charAt(i);
			if(Character.isAlphabetic(c)) {
				s5=s5+c;
				
			}
			
		}
		System.out.println("the string"+s5);
	}

}
