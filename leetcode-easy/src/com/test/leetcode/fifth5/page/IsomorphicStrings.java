package com.test.leetcode.fifth5.page;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//https://leetcode.com/problems/isomorphic-strings/
public class IsomorphicStrings {
	
	
	//best
public static boolean isIsomorphic(String s, String t) {
        
    int[] sCharMapping = new int[128];
    int[] tCharMapping = new int[128];
    
    
    Arrays.fill(sCharMapping, -1);
    Arrays.fill(tCharMapping, -1);
    
    for (int i = 0; i < s.length(); i++) {
		char sChar = s.charAt(i);
		char tChar = t.charAt(i);
		
		if(sCharMapping[sChar]==-1) {
			sCharMapping[sChar]=tChar;
		}else if(sCharMapping[sChar]!=tChar) {
			return false;
		}
		
		if(tCharMapping[tChar]==-1) {
			tCharMapping[tChar]=sChar;
		}else if(tCharMapping[tChar]!=sChar) {
			return false;
		}
		
		
	}


return true;
}

public static boolean isIsomorphicTwo(String s, String t) {
	
    int[] mappingDictStoT = new int[128];
    Arrays.fill(mappingDictStoT, -1);
    
    int[] mappingDictTtoS = new int[128];
    Arrays.fill(mappingDictTtoS, -1);
    
    for (int i = 0; i < s.length(); ++i) {
        char c1 = s.charAt(i);
        char c2 = t.charAt(i);
        
        // Case 1: No mapping exists in either of the dictionaries
        if (mappingDictStoT[c1] == -1 && mappingDictTtoS[c2] == -1) {
            mappingDictStoT[c1] = c2;
            mappingDictTtoS[c2] = c1;
        }
        
        // Case 2: Ether mapping doesn't exist in one of the dictionaries or Mapping exists and
        // it doesn't match in either of the dictionaries or both 
        else if (!(mappingDictStoT[c1] == c2 && mappingDictTtoS[c2] == c1)) {
            return false;
        }
    }
    
    return true;
}


private static String transformString(String s) {
    Map<Character, Integer> indexMapping = new HashMap<>();
    StringBuilder builder = new StringBuilder();
    
    for (int i = 0; i < s.length(); ++i) {
        char c1 = s.charAt(i);
        
        if (!indexMapping.containsKey(c1)) {
            indexMapping.put(c1, i);
        }
        
        builder.append(Integer.toString(indexMapping.get(c1)));
        builder.append(" ");
    }
    return builder.toString();
}


public static boolean isIsomorphicThree(String s, String t) {
	
	return transformString(s).equals(transformString(t));
}



public static void main(String[] args) {
	System.out.println(isIsomorphicThree("paper",  "title"));
}
}
