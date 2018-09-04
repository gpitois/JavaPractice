package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
Find all unique triplets in the array which gives the sum of zero.

Note:
The solution set must not contain duplicate triplets.

Example:
Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
 */
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> out = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; ++i) {
            if (i == 0 || (i > 0 && nums[i - 1] != nums[i])) {
                int start = i + 1;
                int end = nums.length - 1;
                int sum = 0 - nums[i];
                while (start < end) {
                    if (nums[start] + nums[end] == sum) {
                        out.add(Arrays.asList(nums[i], nums[start], nums[end]));
                        while (start < end && nums[start] == nums[start + 1]) ++start;
                        while (start < end && nums[end] == nums[end - 1]) --end;
                        ++start;
                        --end;
                    } else if (nums[start] + nums[end] < sum) {
                        ++start;
                    } else {
                        --end;
                    }
                }
            }
        }
        return out;
    }

}
