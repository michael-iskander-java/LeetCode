package com.test.leetcode.second.page;


//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
public class RemoveDuplicatesFromSortedList {

	public ListNode deleteDuplicates(ListNode head) {

		ListNode currentNode = head;

		while (currentNode != null && currentNode.next != null) {

			if (currentNode.val == currentNode.next.val) {
				currentNode.next = currentNode.next.next;
			} else {

				currentNode = currentNode.next;
			}

		}

		return head;

	}}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
