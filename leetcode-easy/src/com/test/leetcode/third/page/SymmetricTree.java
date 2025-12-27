package com.test.leetcode.third.page;

import java.util.Stack;

import com.test.leetcode.tree.TreeNode;
//https://leetcode.com/problems/symmetric-tree/
public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {

		if (root == null)
			return true;
		Stack<TreeNode> L = new Stack<>();
		Stack<TreeNode> R = new Stack<>();
		TreeNode l = root.left, r = root.right;
		while ((l != null || !L.isEmpty()) || (r != null || !R.isEmpty())) {
			while (l != null && r != null) {
				if (l.val != r.val)
					return false;
				L.push(l);
				R.push(r);
				l = l.left;
				r = r.right;
			}
			if (l != null ^ r != null)
				return false;
			l = L.pop();
			r = R.pop();
			l = l.right;
			r = r.left;
		}
		return L.isEmpty() && R.isEmpty();
	}

}
