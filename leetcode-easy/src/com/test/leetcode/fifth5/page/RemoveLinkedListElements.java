package com.test.leetcode.fifth5.page;

import com.test.leetcode.tree.ListNode;

//https://leetcode.com/problems/remove-linked-list-elements/
public class RemoveLinkedListElements {
	  public ListNode removeElements(ListNode head, int val) {
		   
		  while (head!=null && head.val==val) {
			head = head.next;
		}
		
		  ListNode current = head;
		  
		  while (current!=null&&current.next!=null) {
			if (current.next.val==val) {
				current.next=current.next.next;
			}else {
				current=current.next;
			}
		}
		  
		  return head;
		 
	    }
	  
	  public ListNode removeElementsTwo(ListNode head, int val) {
		  
		  
		  ListNode dummy = new ListNode(-1,head);
		  ListNode previous, current;
		  previous = dummy;
		  current = head;
		  
		  while (current!=null ) {
			 if (current.val ==val) {
				
				previous.next = current.next;
			}else {
				
				previous=current;
			}
			 current = current.next;
		}
		  return dummy.next;
	  }
	
	  
	  public static void main(String[] args) {
		
	}
}
