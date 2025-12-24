package com.test.leetcode.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListNode {

	public int val;
	public ListNode next;

	/*
	 * public ListNode(int x) { val = x; next = null; }
	 */
	
	  public ListNode() { }
	 

	public ListNode(int val) {
		this.val = val;
	}

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	public  static ListNode constructFromArray(int[] array) {
		//List<ListNode> temp = new ArrayList<>();
		//ListNode element = new ListNode(array[0],new ListNode(i+1));
		for (int i : array) {
			//ListNode element = new ListNode(i);
			//temp.add(element);
		}
		//ListNode result = temp.get(0);
		ListNode result = new ListNode(array[0]);
		ListNode pointer = result;
		for (int i = 1; i < array.length; i++) {
			
		ListNode element = new ListNode(array[i]);
			
			pointer.next =element;
			pointer = pointer.next;
		}
		
		return result;
		
	}
	
public static List<Integer> toArrayList(ListNode element) {
	List<Integer> result = new ArrayList<>();
	ListNode pointer = element;
	while (pointer!=null) {
		result.add(pointer.val);
		pointer = pointer.next;
	}
	return result;
}

@Override
public String toString() {
	String result = "";
	ListNode p = this;
	while (p!=null) {
		result+= p.val;
		p = p.next;
	}
	return result;
}
	public static void main(String[] args) {
		System.out.println(toArrayList(constructFromArray(new int[] {1,2,3,4,5})));
		
	}
	
	
}
