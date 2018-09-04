package com.leetcode;

/*
    Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

    Example 1:

    Input: num1 = "2", num2 = "3"
    Output: "6"
    Example 2:

    Input: num1 = "123", num2 = "456"
    Output: "56088"
    Note:

    The length of both num1 and num2 is < 110.
    Both num1 and num2 contain only digits 0-9.
    Both num1 and num2 do not contain any leading zero, except the number 0 itself.
    You must not use any built-in BigInteger library or convert the inputs to integer directly.

    https://leetcode.com/problems/multiply-strings/description/
 */
public class MultiplyStrings {
    public static String multiply(String num1, String num2) {
        int totalSum = 0;
        for (int i = num2.length() - 1; i >= 0; --i) {
            // Extract integer value of current digit
            int y = num2.charAt(i) - '0';
            int currSum = 0;
            for (int j = num1.length() - 1; j >= 0; --j) {
                int x = num1.charAt(j) - '0';
                currSum += x * y * Math.pow(10, num1.length() - j - 1);
            }
            totalSum += currSum * Math.pow(10, num2.length() - i - 1);
        }
        StringBuilder sb = new StringBuilder();
        while (totalSum != 0) {
            sb.append(totalSum % 10);
            totalSum /= 10;
        }
        return sb.reverse().toString();
    }
}
