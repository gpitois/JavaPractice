package com.leetcode;

/*
Given two integers dividend and divisor, divide two integers without using multiplication, division and mod operator.

Return the quotient after dividing dividend by divisor.

The integer division should truncate toward zero.

Example 1:

Input: dividend = 10, divisor = 3
Output: 3
Example 2:

Input: dividend = 7, divisor = -3
Output: -2
Note:

Both dividend and divisor will be 32-bit signed integers.
The divisor will never be 0.
Assume we are dealing with an environment which could only store integers within the 32-bit signed
 integer range: [−2^31,  2^31 − 1]. For the purpose of this problem, assume that your function returns 2^31 − 1
 when the division result overflows.
 */
public class Divide {
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) return Integer.MIN_VALUE;
        int sign = 1;
        if ((dividend < 0 || divisor < 0) && !(dividend < 0 && divisor < 0)) {
            sign = -1;
        }
        long num = Math.abs((long)dividend);
        long den = Math.abs((long)divisor);
        long result = divideHelper(num, den);
        if (result > Integer.MAX_VALUE)
            return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;

        return (int) ((sign > 0) ? result : -result);
    }

    static long divideHelper(long num, long den) {
        if (den > num) {
            // Cannot divide more.
            return 0;
        }
        long multiplier = 1;
        long sum = den;
        while (sum + sum <= num) {
            sum += sum;
            multiplier += multiplier;
        }
        return multiplier + divideHelper(num - sum, den);
    }

}
