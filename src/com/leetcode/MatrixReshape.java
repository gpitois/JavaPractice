package com.leetcode;

/**
 * Created by gpitois on 1/13/18.
 */
public class MatrixReshape {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int cr = nums.length;
        if (cr == 0) return nums;
        int cc = nums[0].length;
        if (cr * cc != r * c) return nums;

        return new int[][]{};
    }
}
