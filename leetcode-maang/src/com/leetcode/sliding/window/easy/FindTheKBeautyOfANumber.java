package com.leetcode.sliding.window.easy;

import java.util.Iterator;

//https://leetcode.com/problems/find-the-k-beauty-of-a-number/
public class FindTheKBeautyOfANumber {
    public static int divisorSubstrings(int num, int k) {
    	
    	String stringNum = intToString(num);
    	
	
    	int count = 0;
    	
    	
    	for (int i = 0; i <= stringNum.length()-k; i++) {
			int part =  Integer.parseInt(stringNum.substring(i,k+i));
			
			if (part!=0) {
				if (num%part==0) {
					count++;
				}
			}
    		
		}
    	
        return count;
    }
    
    public static String intToString(int num) {
    	
    	String result = "";
    
    	while (num>0) {
			int reminder = num%10;
			
			result = reminder + result;
			
			num=num/10;
			
		}
    	
    	return result;
    }
    
    public static int divisorSubstringsTwo(int num, int k) {
    	String stringNum = Integer.toString(num);
    	int count = 0;
    	
    	
    	for (int i = 0; i <= stringNum.length()-k; i++) {
			int part =  Integer.parseInt(stringNum.substring(i,k+i));
			
			if (part!=0 && num%part==0) {
				
					count++;
			}
    		
		}
    	
        return count;
    	
    }
    
    public static void main(String[] args) {
    	
    	 System.out.println(divisorSubstringsTwo(430043,2));
	}
}
