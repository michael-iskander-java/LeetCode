package com.test.leetcode.third.page;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/single-number/
public class SingleNumber {

	
public int singleNumber(int[] nums) {
	
	int temp = 0;
	for (int i : nums) {
		
		temp ^=i;
	}
	
	return temp;
        
    }

public int singleNumberTwo(int[] nums) {
	
	Set<Integer> set = new HashSet<>();
	
	for (Integer integer : nums) {
		if (!set.add(integer)) 
			set.remove(integer);
				
	}
	
	return set.iterator().next();
}

public static void main(String[] args) {
	int[] nums = {4,1,2,1,2};
	System.out.println(new SingleNumber().singleNumberTwo(nums));
}
}
