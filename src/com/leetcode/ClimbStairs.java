package com.leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Note: Given n will be a positive integer.
 * Example 1:
 * Input: 2
 * Output:  2
 * Explanation:  There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 * Input: 3
 * Output:  3
 * Explanation:  There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 */
public class ClimbStairs {
    public static int climbStairs(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        if (n == 2) return 2;
        int nb = 0;
        int n1 = 2;
        int n2 = 1;
        for (int i = 3; i <= n; ++i) {
            nb = n1 + n2;
            n2 = n1;
            n1 = nb;
        }
        return nb;
    }

    @Test
    public void testCase1() {
        assertThat(climbStairs(0), is(1));
        assertThat(climbStairs(1), is(1));
        assertThat(climbStairs(2), is(2));
        assertThat(climbStairs(3), is(3));
        assertThat(climbStairs(4), is(5));
        assertThat(climbStairs(10), is(89));
    }
}

