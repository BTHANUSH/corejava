package com.tnsif.stringdemo;

public class Testimmutable {
	
	public static void main(String[] args) {
		String s="thanush";  // literals
		s.concat("reddy");
		
		System.out.println(s);
		s=s.concat("reddy");
		System.out.println(s);
	}

}
