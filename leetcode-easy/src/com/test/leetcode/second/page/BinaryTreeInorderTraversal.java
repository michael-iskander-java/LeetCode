package com.test.leetcode.second.page;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
//https://leetcode.com/problems/binary-tree-inorder-traversal/
public class BinaryTreeInorderTraversal {

	public static List<Integer> inorderTraversal(TreeNode root) {
		Stack<TreeNode> treeNodes = new Stack<>();
		List<Integer> result = new ArrayList<>();

		TreeNode current = root;

		while (current != null || !treeNodes.isEmpty()) {

			while (current != null) {

				treeNodes.push(current);
				current = current.left;

			}

			current = treeNodes.pop();
			result.add(current.val);
			current = current.right;
		}

		return result;
	}
	
	
	public List<Integer> inorderTraversalTwo(TreeNode root) {
	
		return inorder(root, new ArrayList<>());
	}
	
	private List<Integer> inorder(TreeNode root, List<Integer> list) {
		
		if (root==null) {
			return list;
		}
		
		list = inorder(root.left, list);
		list.add(root.val);
		return inorder(root.right, list);
		
	}

	public static void main(String[] args) {

		TreeNode tree = new TreeNode(1);
       
        tree.left = new TreeNode(2);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);
        
        
        tree.right = new TreeNode(3);
        
        tree.right.left = new TreeNode(6);
        
        System.out.println(inorderTraversal(tree));
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
