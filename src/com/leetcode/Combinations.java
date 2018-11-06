package com.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/*
Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
Example:
Input: n = 4, k = 2
Output:
[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]
 */
public class Combinations {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        addNumber(output, current, k, n, 1);
        return output;
    }

    private static void addNumber(List<List<Integer>> output, List<Integer> current, int k, int n, int ni) {
        if (k == 0) {
            output.add(new ArrayList<>(current));
            return;
        }
        for (int skip = 0; skip <= n - ni; ++skip) {
            current.add(ni + skip);
            addNumber(output, current, k - 1, n, ni + skip + 1);
            current.remove(current.size() - 1);
        }
    }

    @Test
    public void testCase1() {
        System.out.println(combine(4, 2));
    }
}
