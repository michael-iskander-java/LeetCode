package com.test.leetcode.third.page;


import com.test.leetcode.tree.TreeNode;
//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
public class ConvertSortedArrayToBinarySearchTree {
	
	
	
	
	 public TreeNode sortedArrayToBST(int[] nums) {
		 
		 if (nums == null || nums.length == 0) {
			return null;
		}
		 
		 return constructBSTFromArray(nums, 0 , nums.length-1);
		 
	    }
	 
	 private TreeNode constructBSTFromArray(int[] nums, int left, int right) {
		if (left>right) {
			return null;
		}
		
		int midPoint = left + (right - left)/2;
		TreeNode root = new TreeNode(nums[midPoint]);
		root.left = constructBSTFromArray(nums, left, midPoint-1);
		root.right = constructBSTFromArray(nums, right, nums.length-1);
		
		return root;
	}

	public static void main(String[] args) {
		int[] nums = {0,1,2,3,4,5};
		
		
	}

}
