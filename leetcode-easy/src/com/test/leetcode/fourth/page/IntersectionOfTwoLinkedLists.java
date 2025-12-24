package com.test.leetcode.fourth.page;

import java.util.HashSet;
import java.util.Set;

import com.test.leetcode.tree.ListNode;

//https://leetcode.com/problems/intersection-of-two-linked-lists/

public class IntersectionOfTwoLinkedLists {
	
	
	 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        
		 ListNode pointerA = headA;
		 ListNode pointerB = headB;
		 
		while (pointerA!=pointerB) {
			
			if (pointerA!=null) {
				pointerA=pointerA.next;
			} else {
				pointerA=headB;
			}
			
			if (pointerB!=null) {
				pointerB=pointerB.next;
			} else {
				pointerB=headA;
			}
		}	 
		
		return pointerA;
	 }
	 
	 public ListNode getIntersectionNodeTwo(ListNode headA, ListNode headB) {
		 
		
		 
		 Set<ListNode> temp = new HashSet<>();
		 
		 
		 
		 while (headA!=null) {
			 temp.add(headA);
			 headA=headA.next;
		}
		 
		 while (headB!=null) {
			if (temp.contains(headB)) {
				return headB;
			}
			headB=headB.next;
		}
		 return null;
	 }
	 
	 
	 private int count(ListNode list) {
		int count = 0;
		ListNode tempList = list;
		while (tempList!=null) {
			count++;
			tempList = tempList.next;
		}
		

		return count;
	}

	private ListNode findIntersection(int d, ListNode biggerList, ListNode smallerList) {
		
		ListNode biggerTempList = biggerList;
		ListNode smallerTempList = smallerList;
		
		for (int i = 0; i < d; i++) {

			biggerTempList = biggerTempList.next;
			
		}
		
		while (biggerTempList!=null && smallerTempList!=null) {
			if (biggerTempList.val==smallerTempList.val) {
				return biggerTempList;
			}
		}
		
		return null;
	}
}
