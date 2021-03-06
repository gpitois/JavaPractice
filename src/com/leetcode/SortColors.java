package com.leetcode;

import org.junit.Test;

/*
Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are
adjacent, with the colors in the order red, white and blue.
Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
Note: You are not suppose to use the library's sort function for this problem.

Example:

Input: [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Follow up:

A rather straight forward solution is a two-pass algorithm using counting sort.
First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's,
then 1's and followed by 2's.
Could you come up with a one-pass algorithm using only constant space?
*/
public class SortColors {
    public static void sortColors(int[] nums) {
        int n = nums.length;
        int left = 0, right = n - 1;
        int i = 0;
        while (i <= right) {
            if (nums[i] < 1) {
                // Exchange with current left pointer
                nums[i] = nums[left];
                nums[left] = 0;
                ++left;
            }
            if (nums[i] > 1) {
                // Exchange with right
                nums[i] = nums[right];
                nums[right] = 2;
                --right;
                --i;
            }
            ++i;
        }
        System.out.println(matToString(nums));
    }

    @Test
    public void testCase1() {
        int[] m = {2, 0, 2, 1, 1, 0};
        sortColors(m);
    }

    private static String matToString(int[] mat) {
        int n = mat.length;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int j = 0; j < n; ++j) {
            sb.append(mat[j]);
            if (j < n - 1) sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }

}
