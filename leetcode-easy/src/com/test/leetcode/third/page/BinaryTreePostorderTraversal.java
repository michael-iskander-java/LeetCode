package com.test.leetcode.third.page;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import com.test.leetcode.tree.TreeNode;

//https://leetcode.com/problems/binary-tree-postorder-traversal/
public class BinaryTreePostorderTraversal {
	public List<Integer> postorderTraversal(TreeNode root) {

		return postorder(root, new ArrayList<Integer>());

	}

	private List<Integer> postorder(TreeNode root, List<Integer> list) {
		if (root == null) {
			return list;
		}
		list = postorder(root.left, list);
		list = postorder(root.right, list);
		list.add(root.val);

		return list;
	}
	
	public List<Integer> postorderTraversalTwo(TreeNode root) {

		Stack<TreeNode> s = new Stack<TreeNode>();
		List<Integer> result = new LinkedList<>();
		
		if (root!=null) {
			s.push(root);
		}
		while (!s.isEmpty()) {
			TreeNode current = s.pop();
			result.add(0,current.val);
			
			if (current.left!=null) {
				s.push(current.left);
			}
			
			if (current.right!=null) {
				s.push(current.right);
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

		System.out.println(new BinaryTreePostorderTraversal().postorderTraversalTwo(tree));
	}
}
