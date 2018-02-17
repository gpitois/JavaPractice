package com.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
 * You may assume the integer do not contain any leading zero, except the number 0 itself.
 * The digits are stored such that the most significant digit is at the head of the list.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int l = digits.length;
        Deque<Integer> stack = new ArrayDeque<>();
        int add = 1;
        for (int i = l - 1; i >= 0; i--) {
            int result = digits[i] + add;
            add = (10 <= result) ? 1 : 0;
            stack.push(result % 10);
        }
        if (add != 0) stack.push(1);
        int newLength = stack.size();
        int output[] = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            output[i] = stack.pop();
        }
        return output;
    }
}
