package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given a set of candidate numbers (candidates) (without duplicates) and a target number (target),
find all unique combinations in candidates where the candidate numbers sums to target.

The same repeated number may be chosen from candidates unlimited number of times.
Note:

All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.
Example 1:

Input: candidates = [2,3,6,7], target = 7,
A solution set is:
[
  [7],
  [2,2,3]
]
Example 2:

Input: candidates = [2,3,5], target = 8,
A solution set is:
[
  [2,2,2,2],
  [2,3,3],
  [3,5]
]
 */
public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        int n = candidates.length;
        List<List<Integer>> out = new ArrayList<>();
        combinationHelper(out, new ArrayList<>(), candidates, n, 0, target, 0);
        return out;
    }

    static void combinationHelper(List<List<Integer>> out, List<Integer> currList,
                                  int[] candidates, int n, int currSum, int target, int currPos) {
        for (int i = currPos; i < n; ++i) {
            int newSum = currSum + candidates[i];
            currList.add(candidates[i]);
            if (newSum == target) {
                out.add(new ArrayList<>(currList));
                currList.remove(currList.size() - 1);
                return;
            }
            if (newSum > target) {
                currList.remove(currList.size() - 1);
                return;
            }
            combinationHelper(out, currList, candidates, n, newSum, target, i);
            currList.remove(currList.size() - 1);
        }
    }
}
