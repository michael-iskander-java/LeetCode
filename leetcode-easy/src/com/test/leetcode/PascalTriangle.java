package com.test.leetcode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/pascals-triangle/
public class PascalTriangle {
	
	 public static List<List<Integer>> generate(int numRows) {
		 
		 List<List<Integer>> result = new ArrayList<List<Integer>>();
		 
		 for (int i = 0; i < numRows; i++) {
			
			 List<Integer> element = new ArrayList<>();
			 element.add(1);
			 
			 for (int j = 0; j < i; j++) {
				if (j==i-1) {
					element.add(1);
					break;
				} else {
					element.add(result.get(i-1).get(j)+result.get(i-1).get(j+1));

				}
			}
			 result.add(element);
			
		}
		 
		 
	        return result;
	    }
	


	public static void main(String[] args) {
		System.out.println(generate(9));
	}
}
