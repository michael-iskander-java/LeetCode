package com.leetcode.sliding.window.easy;
//https://leetcode.com/problems/maximum-average-subarray-i/
public class MaximumAverageSubarrayI {
	
    public static double findMaxAverage(int[] nums, int k) {
    	
    	double max = 0;
    	double sum = 0;
    	int windowIndex = 0;
    	for (int i = 0; i < nums.length; i++) {
			sum +=nums[i];
			
			if (i - windowIndex == (k-1)) {
				double average =  sum/(double)k;
				if (windowIndex==0) {
					max=average;
				} else {
					
					max=average>=max?average:max;

				}
				sum-=nums[windowIndex++];
				
			}
			
		}
    	
    	
    	return max;
    	
        
    }
    
    public static double findMaxAverageTwo(int[] nums, int k) {
    	
    	int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        // Initialize maxSum as the sum of the first window
        int maxSum = windowSum;

        // Slide the window
        for (int i = k; i < nums.length; i++) {
            // Update the window sum: subtract the element going out and add the element coming in
            windowSum += nums[i] - nums[i - k];
            // Update maxSum if the current windowSum is larger
            maxSum = Math.max(maxSum, windowSum);
        }

        // Return the maximum average
        return (double) maxSum / k;
    }
    
    public static void main(String[] args) {
    	System.out.println(findMaxAverage(new int[] {5},1));
	}

}
