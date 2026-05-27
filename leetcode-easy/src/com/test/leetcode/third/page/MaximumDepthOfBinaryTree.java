package com.test.leetcode.third.page;

import java.util.LinkedList;
import java.util.Queue;

import com.test.leetcode.tree.TreeNode;

//https://leetcode.com/problems/maximum-depth-of-binary-tree/
public class MaximumDepthOfBinaryTree {

	public static int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			int maxLeft = maxDepth(root.left);
			int maxRight = maxDepth(root.right);

			return 1 + ((maxLeft >= maxRight) ? maxLeft : maxRight);

		}
	}
	
	 public static void main(String[] args)
	    {
		 TreeNode root = new TreeNode(3);
	  
	        
	        root.left = new TreeNode(9);
	        root.right = new TreeNode(20);
	        root.right.left = new TreeNode(19);
	        
	  
	        System.out.println("Height of tree is : " +
	                                      maxDepth(root));
	    }
}
