package com.leetcode;

/**
 * Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * Example:
 * Given nums = [1,1,2],
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 * It doesn't matter what you leave beyond the new length.
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (null == nums || 0 == nums.length) return 0;
        int i = 1;
        int j = 1;
        while (i < nums.length && j < nums.length) {
            if (nums[i - 1] != nums[j]) {
                i++;
                j++;
                continue;
            }
            do {
                j++;
            } while (j < nums.length && nums[i - 1] == nums[j]);
            if (j == nums.length) return i;
            nums[i] = nums[j];
            i++;
        }
        return i;
    }
}
