package com.leetcode;

/**
 * https://leetcode.com/problems/integer-to-roman/description/
 */
public class IntToRoman {
    public static String intToRoman(int num) {
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < romans.length; ++i) {
            while (num >= value[i]) {
                num = num - value[i];
                sb.append(romans[i]);
            }
        }
        return sb.toString();
    }
}
