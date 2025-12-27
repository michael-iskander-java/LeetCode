package com.test.leetcode.fifth5.page;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/implement-stack-using-queues/
public class ImplementStackUsingQueues {
	static class MyStack {

		Queue<Integer> queue1 = new LinkedList();
		Queue<Integer> queue2 = new LinkedList();

		public MyStack() {

		}

		public void push(int x) {
			queue1.add(x);
		}

		public int pop() {
			keepLastElement();
			int lastQueue1 = queue1.poll();

			copy();

			return lastQueue1;
		}

		private void keepLastElement() {

			int queue1Size = queue1.size();

			for (int i = 0; i < queue1Size - 1; i++) {
				queue2.add(queue1.poll());

			}
		}

		public int top() {
			keepLastElement();

			return queue1.peek();
		}

		public boolean empty() {
			return queue1.peek() == null;
		}

		private void copy() {

			int queue2Size = queue2.size();
			for (int i = 0; i < queue2Size; i++) {

				queue1.add(queue2.poll());
			}

		}

	}

	public static void main(String[] args) {

		MyStack obj = new MyStack();

		obj.push(1);
		obj.push(2);
		obj.push(3);

		int first = obj.pop();
		int second = obj.pop();
		int last = obj.pop();

		System.out.println(first + " " + second + " " + last + obj.empty());

	}
}
