package com.test.leetcode.third.page;

import com.test.leetcode.tree.TreeNode;

//https://leetcode.com/problems/minimum-depth-of-binary-tree/
public class MinimumDepthOfBinaryTree {

public int minDepth(TreeNode root) {
     
	if (root==null) {
		return 0;
	}
	
	if (root.left==null&&root.right==null) {
		return 1;
	} else {
		
		
		if (root.right==null)
			return 1+minDepth(root.left);
		if (root.left==null)
			return 1+minDepth(root.right);
		

		return Math.min(minDepth(root.right), minDepth(root.left))+1;
	}
	
	
    }
}
