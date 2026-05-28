package com.leetcode.google;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

//128 - https://leetcode.com/problems/longest-consecutive-sequence/
public class LongestConsecutiveSequence {

  public static int longestConsecutive(int[] nums) {
    Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
    int maxLength = 0;
    for (int num : set){
      if (!set.contains(num - 1)) {
        int current = num;
        int length = 1;
        while (set.contains(current + 1)) {
          current = current + 1;
          length++;
        }
        maxLength = Math.max(maxLength, length);
      }
    }
    return maxLength;
  }

  public static void main(String[] args) {
    int[] nums = {100,4,200,1,3,2};
    System.out.println(longestConsecutive(nums));
  }


}
