package com.vishnu.stack;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse :");
		String str= sc.nextLine();
		int len =str.length();
		ArrayStack<Character> stack = new ArrayStack<>();
		for(int i=0; i<len ;i++){
			try {
				stack.push(str.charAt(i));
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
        String reverse ="";
		while(!stack.isEmpty()) {
			try {
				reverse =reverse +stack.peek();
				stack.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("String after reversing :"+reverse);
	}

}
