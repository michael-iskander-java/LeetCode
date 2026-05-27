package com.test.leetcode;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/
public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		
		int [] result = new int[2];
		
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
	
public int[] twoSumTwo(int[] nums, int target) {
	
	Map<Integer, Integer> map = new HashMap<>();
		
		
		
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			 if (map.containsKey(complement)) {
	                return new int[] {map.get(complement), i};
	            }
			 map.put(nums[i], i);
		}
		
		throw new IllegalArgumentException("No two sum solution");
    }


}
