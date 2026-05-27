package com.test.leetcode.fourth.page;

//https://leetcode.com/problems/excel-sheet-column-title/
public class ExcelSheetColumnTitle {
	public static String convertToTitle(int columnNumber) {

		StringBuilder result = new StringBuilder();

		while (columnNumber > 0) {

			int rem = (columnNumber - 1) % 26;
			char c =  (char) (rem + 'A');

			result.append(c);

			columnNumber = (columnNumber - 1) / 26;
		}

		return result.reverse().toString();

	}

	public static void main(String[] args) {
		System.out.println(convertToTitle(704));
	}
}
