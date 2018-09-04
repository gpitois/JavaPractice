package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/*
    Given a collection of distinct integers, return all possible permutations.

    Example:
    Input: [1,2,3]
    Output:
    [
      [1,2,3],
      [1,3,2],
      [2,1,3],
      [2,3,1],
      [3,1,2],
      [3,2,1]
    ]

    https://leetcode.com/problems/permutations/description/
 */
public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        permuteHelper(output, new ArrayList<>(), nums);
        return output;
    }

    private static void permuteHelper(List<List<Integer>> output, List<Integer> current, int[] nums) {
        if (current.size() == nums.length) {
            output.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < nums.length; ++i) {
            if (current.contains(nums[i])) continue;
            current.add(nums[i]);
            permuteHelper(output, current, nums);
            current.remove(current.size() - 1);
        }
    }
}
