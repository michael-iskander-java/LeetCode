package com.test.leetcode.third.page;

import java.util.LinkedList;
import java.util.Queue;

import com.test.leetcode.tree.TreeNode;

//https://leetcode.com/problems/balanced-binary-tree/
public class BalancedBinaryTree {
	
public static boolean isBalanced(TreeNode root) {
        
	if (root == null || returnBalanced(root) > 0) {
		return true;
	}
	
	
        return false;
	
  
 

}
public static int returnBalanced(TreeNode root)
{
    if (root == null)
        return 0;
    int lh = returnBalanced(root.left);
    if (lh == -1)
        return -1;
    int rh = returnBalanced(root.right);
    if (rh == -1)
        return -1;

    if (Math.abs(lh - rh) > 1)
        return -1;
    else
        return Math.max(lh, rh) + 1;
}


private static int maxDepth(TreeNode root) {
	
	if (root == null) {
		return 0;
	}
	
	int hieght=0;
	
	Queue<TreeNode> elements = new LinkedList<TreeNode>();
	
	elements.add(root);
	
	while(!elements.isEmpty()) {
		int size=elements.size();
		
		for (int i = 0; i < size; i++) {
			TreeNode element=elements.poll();
			if (element.left!=null) {
				elements.add(element.left);
			}
			if (element.right!=null) {
				elements.add(element.right);
			}
		}
		hieght++;
	}
	
	return hieght;
}

public static int height( TreeNode root){
	 
   
     int depth = 0;
   
    
    Queue<TreeNode> q=new LinkedList<>();
     
     
    q.add(root);
    q.add(null);
    while(!q.isEmpty()){
    	TreeNode temp = q.peek();
        q.remove();
       
          //When null encountered, increment the value
        if(temp == null){
            depth++;
        }
           
          //If null not encountered, keep moving
        if(temp != null){
            if(temp.left!=null){
                  q.add(temp.left);
            }
              if(temp.right!=null){
                q.add(temp.right);
            }
        }
       
          //If queue still have elements left,
          //push null again to the queue.
        else if(!q.isEmpty()){
            q.add(null);
        }
    }
    return depth;
}

public static int traverseTree(TreeNode root) {
	
	if (root== null) {
		return 0;
	}
	
	int left = traverseTree(root.left);
	int right = traverseTree(root.right);
	
	return Math.max(left, right)+1;
	
}
public static void main(String[] args)
{
	//[1,2,2,3,null,null,3,4,null,null,4]
 TreeNode root = new TreeNode(1);

    
    root.left = new TreeNode(2);
    root.right = new TreeNode(2);
    root.left.left = new TreeNode(3);
    //root.left.right = new TreeNode(3);
    root.left.left.left = new TreeNode(4);
    //root.left.left.right = new TreeNode(4);
    root.right.right = new TreeNode(3);
    root.right.right.right = new TreeNode(4);
    System.out.println("Height of tree is : " +
    		returnBalanced(root));
}



}
