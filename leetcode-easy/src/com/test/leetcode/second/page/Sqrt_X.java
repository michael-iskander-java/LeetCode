package com.test.leetcode.second.page;

public class Sqrt_X {
	//https://leetcode.com/problems/sqrtx/
	   public static int mySqrt(int x) {
		   
		   
		   if(x <= 1)
		        return x;
	        int left = 1 , right = x / 2 , mid , ans = 0;
	        long temp;
	        while(left <= right)
	        {
	            mid = (left + right ) / 2;
	            temp = (long)mid * (long)mid;
	            //mid * mid can be large, so use long
	            if(temp == x)
	                return mid;
	            if(temp < x)
	            {
	                ans = mid;
	                left = mid + 1;
	            }
	            else
	                right = mid - 1;
	        }
	        return ans;
	    }
public static void main(String[] args) {
	System.out.println(mySqrt(30));
}

}
