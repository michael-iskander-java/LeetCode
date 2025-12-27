package com.test.leetcode.second.page;
//https://leetcode.com/problems/length-of-last-word/
public class LengthOfLastWord {
	
	 public static int lengthOfLastWord(String s) {
		 
		 String [] words = s.split("\\s");
	    
		 
		 return words[words.length-1].length();
	    }
	 
		public static int lengthOfLastWordTwo(String s) {
	        int len = 0;
	        s = s.trim();
	        System.out.println("S inside: "+s);
	        for (int i = s.length() - 1; i >=0; i --){
	            if (s.charAt(i) == ' '){
	                break;
	            }
	            else{
	                len ++;
	            }
	        }
	        return len;
	    }
	 
	 
	 
	 public static void main(String[] args) {
		System.out.println(lengthOfLastWord("luffy is still joyboy"));
	}

}
