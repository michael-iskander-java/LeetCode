package com.test.leetcode.third.page;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToBuyAndSellStock {
public int maxProfit(int[] prices) {
	
	int maxProfit = 0;
	
	int left = 0;
	int right =1;
	
	while (right<prices.length) {
		
		
		if (prices[left]<prices[right]) {
			int profit = prices[right] - prices[left];
			maxProfit = Math.max(maxProfit, profit);
		}else {
			left = right;
		}
		right++;		
	}
	
	return maxProfit;
	
    }

public int maxProfitTwo(int[] prices) {
	
	int maxProfit = 0;
	
	int left = 0;
	
	
	for (int right = 1; right < prices.length; right++) {
		
		if (prices[left]<prices[right]) {
			int profit = prices[right] - prices[left];
			maxProfit = Math.max(maxProfit, profit);
		}else {
			left = right;
		}
		
	}
	

	return maxProfit;
	
    }

//private int getSmallestIndex(int[] prices) {
//	
//	int day = 1;
//	if (prices.length==1) {
//		return 0;
//	}
//	
//	for (int i = 0; i < prices.length; i++) {
//	
//		if (i!=day) 
//			if (prices[i]<prices[day]) {
//				day=i;
//			} 
//				
//	}
//	
//	return day;
//	
//}
//
//private int getSellPrice(int[] prices, int day) {
//	
//	int sellPrice = prices[day];
//	
//	for (int i = day+1; i < prices.length; i++) {
//		if (sellPrice<=prices[i]) {
//			sellPrice=prices[i];
//		}
//		
//	}
//	
//	return sellPrice;
//	
//}


public static void main(String[] args) {
	BestTimeToBuyAndSellStock myObject = new BestTimeToBuyAndSellStock();
	
	int[] myArray = {7,6,4,3,1};
	
	System.out.println(myObject.maxProfit(myArray));
}
}
