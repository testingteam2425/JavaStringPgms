package com.programs.strings;

public class StringDiagonally {
	public static void main(String[] args) {
		String s1="mohan";
		String s2= "";
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s2+s1.charAt(i));
			s2=s2+" ";
			
		}
		}

}
