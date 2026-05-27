package com.test.leetcode.fifth5.page;

import java.util.HashSet;
import java.util.Set;
//https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicate {

	  public static boolean containsDuplicate(int[] nums) {
	        
		  Set<Integer> temp = new HashSet<>();
		  
		  for (int num : nums) {
			
			  if (!temp.add(num)) {
				return true;
			}
		}
		  return false;
	    }
	  
	  public static void main(String[] args) {
		System.out.println(containsDuplicate(new int[] {1,2,3,1}));
	}
}
