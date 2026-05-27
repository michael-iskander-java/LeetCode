package com.test.leetcode.third.page;

import java.util.HashSet;
import java.util.Set;

import com.test.leetcode.tree.ListNode;
//https://leetcode.com/problems/linked-list-cycle/
public class LinkedListCycle {
	
	
	    public boolean hasCycle(ListNode head) {
	    	
	    ListNode slow = head;
	    ListNode fast = head;
	    
	    while (fast!= null && fast.next!= null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if (slow == fast) {
				return true;
			}
		}
	    
	    
	    return false;
	    
	    }
	    
	    public boolean hasCycleTwo(ListNode head) {
	    	
	    	
	    	
	    	Set<ListNode> set = new HashSet<>();
	    	ListNode pointer = head;
	    	
	    	while (pointer!=null) {
	    		
				if (!set.add(pointer)) {
					return true;
				}
				pointer = pointer.next;
				
			}
	    	return false;
	    	
	    }

}
