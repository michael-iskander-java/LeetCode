package com.test.leetcode.fifth5.page;

import com.test.leetcode.tree.ListNode;
//https://leetcode.com/problems/reverse-linked-list/
public class ReverseLinkedList {

	 public static ListNode reverseList(ListNode head) {
	      
		 ListNode current = head;
		 ListNode previous = null;
		  
		 while (current!=null) {
			ListNode temp =  current.next;
			current.next=previous;
			previous = current;
			current = temp;
		}
		 
		 return previous;
	    }
	 public static ListNode reverseListTwo(ListNode head) {
	 
	 if (head==null) {
		return null;
	}
	 
	 ListNode newHead = head;
	 
	 if (head.next!=null) {
		 newHead=reverseListTwo(head.next);
		 head.next.next=head;
	 
	 }
	 head.next = null;
	 return newHead;
	 }
	 public static void main(String[] args) {
		
		 ListNode temp = ListNode.constructFromArray(new int[] {1,2,3,4,5});
		 System.out.println(temp);
		 //ListNode reversed = reverseListTwo(temp);
		 ListNode reversed = reverseList(temp);
		 System.out.println(ListNode.toArrayList(reversed));
		 System.out.println(reversed);
	}
}
