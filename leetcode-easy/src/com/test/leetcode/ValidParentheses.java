package com.test.leetcode;

import java.util.Stack;

//https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {

	public static boolean isValid(String s) {

		Stack<Character> sStack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {

			char sCharacter = s.charAt(i);

			if (sCharacter == '(' || sCharacter == '{' || sCharacter == '[') {
				sStack.push(sCharacter);
				continue;
			}
			
			if (sStack.empty()) 
				return false;
			
			
			char popCharacter = sStack.pop();

			switch (sCharacter) {
			case ')':
				
				if (popCharacter != '(')
					return false;
				break;

			case ']':
				
				if (popCharacter != '[')
					return false;
				
				break;
			case '}':
				
				if (popCharacter != '{')
					return false;
				
				break;
			default:
				continue;
			}
		}
		
		return sStack.isEmpty();
	}

	public static void main(String[] args) {
		System.out.println(isValid("()"));
	}
}
