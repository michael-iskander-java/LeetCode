package com.test.leetcode.third.page;

import java.util.LinkedList;
import java.util.Queue;

import com.test.leetcode.tree.TreeNode;
//https://leetcode.com/problems/maximum-depth-of-binary-tree/
public class MaximumDepthOfBinaryTreeTwo {
	
	public int maxDepth(TreeNode root) {
		
		Queue<TreeNode> q = new LinkedList<>();
		int depth = 0;
		
		q.add(root);
		q.add(null);
		
		while (!q.isEmpty()) {
			
			TreeNode temp = q.remove();
			
			if (temp == null) {
				depth++;
			}
			
			if (temp != null) {
				
				if (temp.left != null) {
					q.add(temp.left);
				}
				
				if (temp.right != null) {
					q.add(temp.right);
				}
				
			} else if(!q.isEmpty())  {

				q.add(null);
			}
		}
		
		
		
		return depth;
	}

}
