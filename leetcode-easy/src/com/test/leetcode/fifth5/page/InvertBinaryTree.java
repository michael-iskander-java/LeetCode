package com.test.leetcode.fifth5.page;

import java.util.LinkedList;
import java.util.Queue;

import com.test.leetcode.tree.TreeNode;

public class InvertBinaryTree {
	public TreeNode invertTree(TreeNode root) {
		
		if (root==null) {
			return null;
		}

		Queue<TreeNode> elements = new LinkedList<>();
		elements.add(root);
		while (!elements.isEmpty()) {

			TreeNode current = elements.poll();

			TreeNode temp = current.left;
			current.left = current.right;
			current.right = temp;

			if (current.left != null) {
				elements.add(current.left);
			}

			if (current.right != null) {
				elements.add(current.right);
			}

		}

		return root;

	}
	
	public TreeNode invertTreeTwo(TreeNode root) {
		
		TreeNode newHead = root;
		
		if (newHead==null) {
			return null;
		}
		TreeNode temp = newHead.left;
		newHead.left = newHead.right;
		newHead.right = temp;
		invertTreeTwo(newHead.left);
		invertTreeTwo(newHead.right);
		return newHead;
		
		
	}
}
