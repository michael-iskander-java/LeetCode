package com.test.leetcode;

import java.util.Arrays;

public class TwoSumsSlidingWindow {
public static int[] twoSum(int[] nums, int target) {
		
		int [] result = new int[2];
		
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length; i++) {
			
			for (int j = i+1; j < nums.length; j++) {
				
				int temp = nums[i]+nums[j];
				if(temp == target) {
					result[0]=i;
					result[1]=j;
				}
			}
		}
     
		
		return result;
    }

}
