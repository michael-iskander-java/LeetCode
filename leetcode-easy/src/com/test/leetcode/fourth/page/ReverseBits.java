package com.test.leetcode.fourth.page;



//https://leetcode.com/problems/reverse-bits/
public class ReverseBits {
	
	 public static int reverseBits(int n) {
		
		 int result = 0;
		 
		for (int i = 0; i < 32; i++) {
			int bit = (n>>i)&1;
			result |=(bit<<(31-i)); 
						
		}
		 
		 return result;
	    }
	 
	 public static int reverseBitsTwo(int n) {
	        int res = 0;
	        int x = 31;
	        while(x >= 0){
	            res = res ^ ((n & 0x1) << (x--));
	            n >>= 0x1;
	        }

	        return res;
	    }
	 //best 1ms
	 public static int reverseBitsThree(int n) {
		 int res = 0;
		 for (int i = 0; i < 32; i++) { 
		 res<<=1;
		 if ((n&1)>0) {
			res++;
		}
		 n>>=1;
		 }
		 return res;
	 }
	 
	 public static void main(String[] args) {
		 int n = 43261596;
		System.out.println(reverseBitsThree(n));
		System.out.println(n);
	}
}
