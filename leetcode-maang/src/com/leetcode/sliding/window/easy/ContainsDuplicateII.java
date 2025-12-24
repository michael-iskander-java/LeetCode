package com.leetcode.sliding.window.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/contains-duplicate-ii/
public class ContainsDuplicateII {
public static boolean containsNearbyDuplicate(int[] nums, int k) {
	
	if(nums==null || nums.length<2 || k==0)
        return false;
	
	Set<Integer> temp = new HashSet<>();
	int j = 0;
	for (int i = 0; i < nums.length; i++) {
		if (!temp.add(nums[i])) {
			return true;
		}
		
		
		if (temp.size()>k) {
			temp.remove(nums[j++]);
			
		}
	}
	
	return false;
        
    }

public static boolean  containsNearbyDuplicateTwo(int[] nums, int k) {
	
	
	
	Map<Integer, Integer> searchMap = new HashMap<>();
	
	for (int i = 0; i < nums.length; i++) {
	
		if (searchMap.containsKey(nums[i]) && i-searchMap.get(nums[i])<=k ) {
			return true;
			
		}else {
			searchMap.put(nums[i], i);
		}
	}

	return false;
   }

public static void main(String[] args) {
    System.out.println(containsNearbyDuplicateTwo(new int[] {4,1,2,3,1,5},3));
  }
}


