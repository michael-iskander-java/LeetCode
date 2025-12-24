package com.test.leetcode.third.page;

import java.util.LinkedList;
import java.util.Queue;

import com.test.leetcode.tree.TreeNode;
//https://leetcode.com/problems/maximum-depth-of-binary-tree/
public class MaximumDepthOfBinaryTreeThree {

	public int maxDepth(TreeNode root) {
		
		Queue<TreeNode>q=new LinkedList<TreeNode>();
		
		if (root == null ) {
			return 0;
		}
        q.add(root);
        int height=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
            	TreeNode temp=q.poll();
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            height++;
            
        }
        return height;
		
	}
}
