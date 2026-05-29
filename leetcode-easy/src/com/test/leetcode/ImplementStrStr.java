package com.test.leetcode;
//28-https://leetcode.com/problems/implement-strstr/
//28-https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string
public class ImplementStrStr {

	public static int strStr(String haystack, String needle) {

		if (needle.isEmpty()) {
			return 0;

		}

		for (int i = 0; i < haystack.length(); i++) {

			int partLenght = i + needle.length();

			if (partLenght <= haystack.length()) {

				String part = haystack.substring(i, partLenght);
				if (part.equals(needle)) {
					return i;
				}
			} else {
				break;
			}

		}

		return -1;

	}

	public static void main(String[] args) {

		String haystack = "a";
		String needle = "a";

		System.out.println(strStr(haystack, needle));
	}
}
