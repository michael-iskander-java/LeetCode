package com.leetcode.islands.matrix.traversal;

import java.util.Arrays;
import java.util.stream.Collectors;

public class NumberOfIslands {
	
	    public static int numIslands(char[][] grid) {
	    	
	    	if (grid == null || grid.length == 0 ) {
				return 0;
			}
	        
	    	int result = 0;
	    	
	    	for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[i].length; j++) {
					if (grid[i][j]=='1') {
						result+= searchDepthFirst(grid, i, j);
					}
					
				}
			}
	    	
	    	return result;
	    }
	    
	    private static int searchDepthFirst(char[][] grid, int i, int j) {
	    	if (i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]=='0') {
				return 0;
			}
	    	
	    	grid[i][j]='0';
	    	searchDepthFirst(grid, i-1, j);
	    	searchDepthFirst(grid, i+1, j);
	    	searchDepthFirst(grid, i, j+1);
	    	searchDepthFirst(grid, i, j-1);
	    	
	    	
	    	
	    	return 1;
	    	
	    }
	    
	    
	    
	    
	    public static int numIslandsTwo(char[][] grid) {
	    	
	    	
	            
	            boolean visited[][] = new boolean[grid.length][grid[0].length];
	     
	            
	            int result = 0;
	            for (int i = 0; i < grid.length; ++i)
	                for (int j = 0; j < grid[i].length; ++j)
	                    if (grid[i][j] == '1' && !visited[i][j]) 
	                    { 
	                    	result +=DFS(grid, i, j, visited);
	                        
	                    }
	     
	            return result;
	        
	    	
	    } 
	    private static int DFS(char grid[][], int i, int j, boolean visited[][])
	    {
	        
	    	if (i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]=='0'||visited[i][j]) {
				return 0;
			}
	    	
	 
	       
	    	visited[i][j] = true;
	 
	    	DFS(grid, i-1, j, visited);
	    	DFS(grid, i+1, j, visited);
	    	DFS(grid, i, j-1, visited);
	    	DFS(grid, i, j+1, visited);
	        return 1;
	    }
	    
	
	public static void main(String[] args) {
		char[][] grid = {
				
				{'1','1','1','1','0'},
				  {'1','1','0','1','0'},
				  {'1','1','0','0','0'},
				  {'0','0','0','0','0'}
		};
		
		System.out.println(grid.length);
		
		System.out.println(numIslandsTwo(grid));
		
		for (char[] cs : grid) {
			System.out.println(Arrays.toString(cs));
		}
		
		
		
		
		
	}
	
}
