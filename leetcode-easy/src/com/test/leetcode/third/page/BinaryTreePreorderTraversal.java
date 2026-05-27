package com.test.leetcode.third.page;

import java.util.ArrayList;

import java.util.List;

import java.util.Stack;

import com.test.leetcode.tree.TreeNode;

//https://leetcode.com/problems/binary-tree-preorder-traversal/
public class BinaryTreePreorderTraversal {

	public List<Integer> preorderTraversal(TreeNode root) {

		return preorder(root, new ArrayList<>());

	}

	private List<Integer> preorder(TreeNode root, List<Integer> list) {
		if (root == null) {
			return list;
		}

		list.add(root.val);
		list = preorder(root.left, list);
		return preorder(root.right, list);
	}

	public List<Integer> preorderTraversalTwo(TreeNode root) {
		List<Integer> result = new ArrayList<>();

		Stack<TreeNode> q = new Stack<>();

		if (root != null) {
			q.add(root);
		}
		while (!q.isEmpty()) {
			TreeNode pointer = q.pop();

			result.add(pointer.val);
			if (pointer.right != null) {
				q.push(pointer.right);
			}
			if (pointer.left != null) {
				q.push(pointer.left);
			}

		}

		return result;

	}

	public static void main(String[] args) {
		TreeNode tree = new TreeNode(1);

		tree.left = new TreeNode(2);
		tree.left.left = new TreeNode(4);
		tree.left.right = new TreeNode(5);

		tree.right = new TreeNode(3);

		tree.right.left = new TreeNode(6);

		System.out.println(new BinaryTreePreorderTraversal().preorderTraversalTwo(tree));
	}
}
