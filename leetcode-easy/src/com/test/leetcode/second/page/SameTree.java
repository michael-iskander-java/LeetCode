package com.test.leetcode.second.page;

import java.util.ArrayDeque;
//https://leetcode.com/problems/same-tree/
public class SameTree {

	private boolean check(TreeNode p, TreeNode q) {

		if (p == null && q == null) {
			return true;
		} else if (p == null || q == null) {
			return false;
		} else if (p.val != q.val) {
			return false;
		}
		return true;
	}

	public boolean isSameTree(TreeNode p, TreeNode q) {

		if (p == null && q == null) 
			return true;
		if (!check(p, q))
			return false;

		ArrayDeque<TreeNode> pNodes = new ArrayDeque<>();
		ArrayDeque<TreeNode> qNodes = new ArrayDeque<>();

		pNodes.addLast(p);
		qNodes.addLast(q);

		while (!pNodes.isEmpty()) {
			p = pNodes.removeFirst();
			q = qNodes.removeFirst();

			if (!check(p, q))
				return false;
			if (p != null) {

				if (!check(p.left, q.left))
					return false;
				if (p.left != null) {
					pNodes.addLast(p.left);
					qNodes.addLast(q.left);
				}
			}

			if (!check(p.right, q.right))
				return false;

			if (p.right != null) {

				pNodes.addLast(p.right);
				qNodes.addLast(q.right);
			}
		}

		return true;

	}

}
	
