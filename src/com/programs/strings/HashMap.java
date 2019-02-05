package com.programs.strings;

public class HashMap {
	public static void main(String[] args) 
	{
		java.util.HashMap<String,Integer>h1=new java.util.HashMap<String, Integer>();
		h1.put("gandhi",1234);
		h1.put("konda",678);
		h1.put("gopi",9099);
		h1.put("vshnu",8088);
		System.out.println("the key-value pair"+h1);
		System.out.println(h1.containsKey("darshan"));
		
		
		
		
		
		System.out.println("the key is"+h1.get("gandhi"));
		System.out.println("the set is empty"+h1.isEmpty());
		System.out.println("the keys are"+h1.keySet());
		System.out.println("the values are"+h1.values());
		
		
		
		
		
		
	}
}
