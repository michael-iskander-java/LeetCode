package com.test.leetcode.fifth5.page;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/happy-number/
public class HappyNumber {
	
	private static Set<Integer> cycleMembers = new HashSet<>(Arrays.asList(4, 16, 37, 58, 89, 145, 42, 20));
	 public static boolean isHappy(int n) {
		 
		 
	        Set<Integer> seen = new HashSet<>();
	        while (n!=1) {
	        	
	        	int temp = findSum(n);
	        	
				if(!seen.add(temp))
					return false;
				
				n = temp;
			}
		 return true;
	    }
	 
	 private static int findSum(int n) {
		 int sum =0;
		while (n>0) {
			int rem = n%10;
			sum+=rem*rem;
			n/=10;
		}
	return sum;
	 }
	 //best
	 public static boolean isHappyTwo(int n) {
		 
		 int slowPointer = n;
		 int fastPointer = findSum(slowPointer);
		 
		 while (fastPointer!=1 && slowPointer!=fastPointer) {
			
			 slowPointer=findSum(slowPointer);
			 fastPointer=findSum(findSum(fastPointer));
			 
			 
		}
		 
		 return fastPointer==1;
	 }
	 
	 public static boolean isHappyThree(int n) {
		 
		 while (n != 1 && !cycleMembers.contains(n)) {
	            n = findSum(n);
	        }
	        return n == 1;
	 }

	 public static boolean isHappyFour(int n) {
		 
		 while (n != 1 && n!=4) {
	            n = findSum(n);
	        }
	        return n == 1;
	 }

public static void main(String[] args) {
	System.out.println(isHappyFour(19));
}
}
