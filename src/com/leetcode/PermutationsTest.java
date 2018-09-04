package com.leetcode;

import org.junit.Test;

import java.util.List;

public class PermutationsTest {
    @Test
    public void case1(){
        int[] nums = new int[] {1,2,3};
        List<List<Integer>> result = Permutations.permute(nums);
        System.out.println(result);
    }
}
