package com.test.leetcode.fourth.page;
//https://leetcode.com/problems/number-of-1-bits/
public class NumberOf1Bits {
public int hammingWeight(int n) {
    int length=0; 
	
    for (int i = 0; i < 32; i++) {
		
    	if ((n&1)==1) {
			length++;
		}
    	n>>>=1;
	}
    
    return length;
	
    }
}
