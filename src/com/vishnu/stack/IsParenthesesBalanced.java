package com.vishnu.stack;

import java.util.LinkedList;
import java.util.Scanner;

public class IsParenthesesBalanced {

	
	
	
	
	public static void main(String[] args) {
		LinkedList<Character> stack = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the expression to checked balanced parentheses :");
		String exp = sc.nextLine();
		//String exp = "[{(})]";
		boolean flag= false;
		int len = exp.length();
		
		for(int i=0 ; i< len ;i++) {
			if(isOpenBraces(exp.charAt(i))) {
				stack.push(exp.charAt(i));
			}
			else if(isCloseBraces(exp.charAt(i))) {
				
				if(!stack.isEmpty()) {
					if(closing(stack.peek().charValue()) ==  exp.charAt(i)) {
						flag= true;
					}
					stack.pop();
				}
			}
			
		}
		
		if(stack.isEmpty() && flag ==true) {
			System.out.println("The expression is balanced....");
		}
		else {
			System.out.println("The expression is not balanced....");
		}
	}
	
	private static boolean isOpenBraces(char open) {
		if(open == '[' || open == '{' || open == '(') {
			 return true;
		}
		else {
			return false;
		}
		
	}
	
    private static boolean isCloseBraces(char close) {
		if(close == ']' || close == '}' || close == ')') {
			return true;
		}
		else {
			return false;
		}
		
	}
    
    private static char closing(char ch) {
    	if(ch == '[') {
    		return ']';
    	}
    	else if (ch == '{') {
    		return '}';
    	}
    	else if(ch == '(') {
    		return ')';
    	}
    	else {
    		return ch;
    	}
    	
    }

}
