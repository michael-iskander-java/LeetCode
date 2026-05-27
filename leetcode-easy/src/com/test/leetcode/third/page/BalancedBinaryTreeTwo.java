package com.test.leetcode.third.page;

import com.test.leetcode.tree.TreeNode;

//https://leetcode.com/problems/balanced-binary-tree/
public class BalancedBinaryTreeTwo {

	
	private boolean balanced=true;
	
    public boolean isBalanced(TreeNode root) {
    	if (root == null) {
		return true;
	}
	
    	traverseTree(root);
        return balanced;

}
    
    public int traverseTree(TreeNode root) {
    	
    	if (root == null) {
			return 0;
		}
    	
    	int left = traverseTree(root.left);
    	int right = traverseTree(root.right);
    	
    	if (Math.abs(right-left)>1) {
    		balanced = false;
		}
    	
    	return Math.max(left, right)+1;
    }
}
