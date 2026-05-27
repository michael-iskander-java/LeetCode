package com.test.leetcode;



public class IsPalindromeString {

	public static boolean isPalindromeString(String x) {
		
		String reverse="";
		
		for (int i = x.length()-1; i >= 0; i--) {
			
			reverse=reverse+x.charAt(i);
		}
		
		System.out.println("reverse: "+reverse);
		
		return x.equals(reverse);
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindromeString("hkSaid"));
	}
}
