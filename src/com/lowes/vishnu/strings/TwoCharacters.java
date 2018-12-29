package com.lowes.vishnu.strings;

public class TwoCharacters {
	
	public static void main(String [] args) {
		String str= "hello";
		String str1 = str.replace('l', ' ');
		System.out.println(str1.replaceAll("\\s+",""));
		
	}

}
