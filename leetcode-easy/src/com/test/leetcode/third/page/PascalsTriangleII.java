package com.test.leetcode.third.page;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/pascals-triangle-ii/
public class PascalsTriangleII {

    public List<Integer> getRow(int rowIndex) {
    	
		
		  List<Integer> result = new ArrayList<>();
		  
		  result.add(1);
		  
		  if (rowIndex==0) {
			return result;
		}
		  
		  List<Integer> previous = getRow(rowIndex-1);
		  
		  for (int i = 1; i <= rowIndex-1; i++) { 
			  
		  Integer current = previous.get(i-1) + previous.get(i);
		  
		  result.add(current); 
		  } 
		  result.add(1);
		  return result;
		 
    	
    }
    
    public List<Integer> getRowTwo(int rowIndex) {
    	
		
		  List<Integer> result = new ArrayList<>();
		  
		for (int i = 0; i <= rowIndex; i++) {
			int element = (int)Math.round(combinate(rowIndex, i));
			result.add(element);
		}
		
		return result;
  	
  }
    
    
    private double combinate(int c, int r) {
    	
    	return factorial(c)/(factorial(r)*factorial(c-r));
    	
    	
    }
    
    private double factorial(int n) {
    	
    	double fact = 1;
    	
    	for (int i = 1; i <=n ; i++) {
			fact *= i;
		}
    	return fact;
    }
    
    public static void main(String[] args) {
    	PascalsTriangleII myObject = new PascalsTriangleII();
    	System.out.println(myObject.getRowTwo(30));
	}
}
