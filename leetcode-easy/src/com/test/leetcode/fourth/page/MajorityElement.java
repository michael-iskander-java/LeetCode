package com.test.leetcode.fourth.page;

import java.util.HashMap;
import java.util.Map;
//https://leetcode.com/problems/majority-element/
public class MajorityElement {
	
	   public int majorityElement(int[] nums) {
	       
		   int majority = nums[0];
		   
		   int count = 1;
		   
		  for (int i = 1; i < nums.length; i++) {
			
			  if (nums[i]==majority) {
				  count++;
			} else {

				count--;
				
				if (count==0) {
					majority = nums[i];
					count++;
				}
				
			}
			  
		}
		   
		   return majority;
	    }
	   
	   public static int majorityElementTwo(int[] nums) {
		   
		  
		   
		  Map<Integer, Integer> mapNums = new HashMap<>();
		   
		  for (int num : nums) {
			
			  if (mapNums.containsKey(num)&& mapNums.get(num)+1>nums.length/2) {
				return num;
			} else {

				mapNums.put(num, mapNums.getOrDefault(num, 0)+1);
			}
			  
		}
		  
		  return nums[0];
	   }
	   
	   public static void main(String[] args) {
		   int[] nums = {2,2,1,1,1,2,2};
		   
		   System.out.println(majorityElementTwo(nums));
	}
}
