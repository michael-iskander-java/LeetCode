package com.leetcode.patterns.sum.prefix.pattern;



//https://leetcode.com/problems/range-sum-query-immutable/description/
public class RangeSumQueryImmutable {

	public static class NumArray {

		private int [] prefixSum;
	    public NumArray(int[] nums) {
	    	prefixSum = new int [nums.length];
	    	int sum = 0;
	    	for (int i = 0; i < nums.length; i++) {
	    		sum+=nums[i]; 
	    		prefixSum[i] = sum;
			}
	    	System.out.println(prefixSum);
	    }
	    
	    public int sumRange(int left, int right) {
	    	if (left == 0) {
	    		return prefixSum[right];
			} else {
				return prefixSum[right] - prefixSum[left-1];
			}
	        
	    }
	}
	
	public static class NumArrayTwo {

		private int [] nums;
	    public NumArrayTwo(int[] nums) {
	    	this.nums = nums;
	
	    }
	    
	    public int sumRange(int left, int right) {
	    	int sum = 0;
	    	for (int i = 0; i < nums.length; i++) {
	    		
				if (i>=left) {
					sum+=nums[i];
				
				}
				
				if (i == right) {
					return sum;
				}
				
			}
	    	throw new IllegalArgumentException("No sum solution");
	    }
	    
	    
	}
	public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArrayTwo obj = new NumArrayTwo (nums);
        System.out.println(obj.sumRange(0, 2)); // Output: 1
        System.out.println(obj.sumRange(2, 5)); // Output: -1
        System.out.println(obj.sumRange(0, 5)); // Output: -3
    }
}
