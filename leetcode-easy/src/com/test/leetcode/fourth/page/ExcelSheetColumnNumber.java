package com.test.leetcode.fourth.page;

//https://leetcode.com/problems/excel-sheet-column-number/
public class ExcelSheetColumnNumber {
	
	  public static int titleToNumber(String columnTitle) {
	        
		  int result = 0;
		  int count = 1;
		  
		  for (int j = columnTitle.length() - 1; j >= 0; j--) {
			
			  result+=(columnTitle.charAt(j)-'A'+1)*count;
			  count*=26;
		}
		  
		  return result;
	    }
	  
	  public static int titleToNumberTwo(String columnTitle) {
		  int result=0;
	      for(int i = 0; i < columnTitle.length(); i++){
	          result*=26;
	          result+=(columnTitle.charAt(i)-'A'+1);
	      }
	      return result;
		  
	  }
	  
	  
	  public static void main(String[] args) {
		System.out.println(titleToNumber("A"));
	}

}
