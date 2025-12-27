package com.test.leetcode.third.page;


//https://leetcode.com/problems/valid-palindrome/
public class ValidPalindrome {
	
public boolean isPalindrome(String s) {
    
	
	String transformed= "";
	
	for (char c : s.toCharArray()) {
		if (Character.isLetterOrDigit(c)) {
			transformed += c;
		}
	}
	
	String reverse= "";
	
	for (int i = transformed.length()-1; i >= 0; i--) {
		
		reverse+=transformed.charAt(i);
	}
	
	return transformed.equalsIgnoreCase(reverse);
	}

public boolean isPalindromeTwo(String s) {
	int left = 0;
	int right = s.length()-1;
	
	while (left<right) {
		while (left<right && !alphaNumeric(s.charAt(left))) {
			left++;
		}
		while (left<right && !alphaNumeric(s.charAt(right))) {
			right--;
		}
		
		if (Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))) {
			return false;
		}
		left++;
		right--;
	}
	return true;
}

private boolean alphaNumeric(char c) {
	if (('a'<=c && c<='z') ||
		('A'<=c && c<='Z') ||
		('0'<=c && c<='9')) {
		return true;
		
	}
	return false;
}

public static void main(String[] args) {
	
System.out.println(new ValidPalindrome().isPalindromeTwo(""));
}
}
