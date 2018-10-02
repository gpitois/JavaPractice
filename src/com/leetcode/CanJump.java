package com.leetcode;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/*
Given an array of non-negative integers, you are initially positioned at the first index of the array.
Each element in the array represents your maximum jump length at that position.
Determine if you are able to reach the last index.

Example 1:
Input: [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

Example 2:
Input: [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum
             jump length is 0, which makes it impossible to reach the last index.
 */
public class CanJump {
    public boolean canJump(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return true;
        Deque<Integer> path = new ArrayDeque<>();
        boolean[] doesNotReach = new boolean[nums.length];
        path.addLast(0);
        return canJumpHelper(path, nums, doesNotReach);
    }

    static boolean canJumpHelper(Deque<Integer> path, int[] nums, boolean[] doesNotReach) {
        int goal = nums.length - 1;
        Integer position = path.getLast();
        if (position >= goal) return true;
        Integer maxRange = nums[position];
        for (int i = 1; i <= maxRange; ++i) {
            if (position + i == goal) return true;
        }
        for (int i = maxRange; i >= 1; --i) {
            if (doesNotReach[position + i]) continue;
            path.addLast(position + i);
            boolean nextPath = canJumpHelper(path, nums, doesNotReach);
            if (nextPath) return true;
            path.removeLast();
            doesNotReach[position + i] = true;
        }
        return false;
    }

    @Test
    public void shouldReachLast() {
        int[] a = {2, 3, 1, 1, 4};
        assertThat(canJump(a), is(true));
    }

    @Test
    public void shouldNotReachLast() {
        int[] a = {3, 2, 1, 0, 4};
        assertThat(canJump(a), is(false));
    }

    @Test
    public void shouldReachLastOne() {
        int[] a = {1};
        assertThat(canJump(a), is(true));
    }
}
