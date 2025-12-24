package com.test.leetcode.second.page;

import java.util.Arrays;
import java.util.stream.Collectors;
//https://leetcode.com/problems/merge-sorted-array/submissions/
public class MergeSortedArray {

	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		int i = m - 1;
		int j = n - 1;
		int idx = m + n - 1;

		while (i >= 0 && j >= 0) {

			if (nums1[i] >= nums2[j]) {
				nums1[idx] = nums1[i];
				i--;

			} else {
				nums1[idx] = nums2[j];
				j--;

			}
			idx--;
		}

		while (i >= 0)
			nums1[idx--] = nums1[i--];

		while (j >= 0)
			nums1[idx--] = nums2[j--];

	}

	public static void main(String[] args) {

		int[] nums1 = { 1};
		int[] nums2 = { };
		merge(nums1, 1, nums2, 0);
		System.out.println(Arrays.stream(nums1).boxed().collect(Collectors.toList()));

	}

}
class MergeSortedArrayTwo{
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		int i = m - 1;
		int j = n - 1;
		int idx = m + n - 1;

		while (i >= 0 && j >= 0) {

			nums1[idx--]=nums1[i] >= nums2[j]?nums1[i--]:nums2[j--];
			
		
		}

		

		while (j >= 0)
			nums1[idx--] = nums2[j--];

	}
	
	public static void main(String[] args) {
		int[] nums1 = {0,1,1,0,0,0};
		int[] nums2 = { 6,7,8};
		merge(nums1, 3, nums2, 3);
		System.out.println(Arrays.stream(nums1).boxed().collect(Collectors.toList()));
	}
	
	
}
