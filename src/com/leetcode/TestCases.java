package com.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestCases {
    @Test
    public void case1() {
        int[] a = {1, 2, 2, 3};
        assertThat(IsMonotonic.isMonotonic(a), is(true));
    }

    @Test
    public void case2() {
        int[] a = {6, 5, 4, 4};
        assertThat(IsMonotonic.isMonotonic(a), is(true));
    }

    @Test
    public void case3() {
        int[] c = {1, 3, 2};
        assertThat(IsMonotonic.isMonotonic(c), is(false));
    }

    @Test
    public void case4() {
        int[] d = {1, 1, 1};
        assertThat(IsMonotonic.isMonotonic(d), is(true));
    }

    @Test
    public void case5() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> outList = new ArrayList<>();
        List<Integer> l1 = Arrays.asList(-1, 0, 1);
        List<Integer> l2 = Arrays.asList(-1, -1, 2);
        outList.add(l1);
        outList.add(l2);

        assertThat(ThreeSum.threeSum(nums), is(outList));
    }

    @Test
    public void case6() {
        int[] d = {4, 5, 6, 7, 0, 1, 2};
        assertThat(SearchInRotatedArray.search(d, 0), is(4));
        assertThat(SearchInRotatedArray.search(d, 3), is(-1));
    }

    @Test
    public void case7() {
        int[] d = {1};
        assertThat(SearchInRotatedArray.search(d, 1), is(0));
    }

    @Test
    public void case8() {
        int[] a = {2, 3, 6, 7};
        System.out.println(CombinationSum.combinationSum(a, 7));
    }

    @Test
    public void case9() {
        int[] a = {2, 3, 6, 7};
        System.out.println(CombinationSum.combinationSum(a, 7));
    }

    @Test
    public void case10() {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(printMatrix(mat));
        RotateImage.rotate(mat);
        System.out.println(printMatrix(mat));
    }

    String printMatrix(int[][] a) {
        String s = "";
        for (int i = 0; i < 3; ++i) {
            s += "[";
            for (int j = 0; j < 3; ++j) {
                s += Integer.toString(a[i][j]) + " ";
            }
            s += "]\n";
        }
        return s;
    }

    @Test
    public void case11() {
        assertThat(PowerXn.myPow(2.0, 10), is(1024.0));
        assertThat(PowerXn.myPow(2.0, -2), is(0.25));
        assertThat(PowerXn.myPow(2.1, 3), is(9.2610));
    }
}
