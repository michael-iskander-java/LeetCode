package com.test.leetcode.second.page;

import java.util.Arrays;

import java.util.stream.Collectors;

//https://leetcode.com/problems/plus-one/
public class PlusOne {

	public static int[] plusOne(int[] digits) {

		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}

			digits[i] = 0;
		}
		int[] result = new int[digits.length + 1];

		result[0] = 1;

		return result;

	}

	public static void main(String[] args) {
		int[] digits = {4,3,2,1};

		System.out.println(Arrays.stream(plusOne(digits)).boxed().collect(Collectors.toList()));

		//System.out.println(Arrays.stream(plusOne(digits)).boxed().collect(Collectors.toList()));
	}
}
