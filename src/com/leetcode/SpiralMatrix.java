package com.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 * <p>
 * Example 1:
 * Input:
 * [
 * [ 1, 2, 3 ],
 * [ 4, 5, 6 ],
 * [ 7, 8, 9 ]
 * ]
 * Output: [1,2,3,6,9,8,7,4,5]
 * <p>
 * Example 2:
 * Input:
 * [
 * [1, 2, 3, 4],
 * [5, 6, 7, 8],
 * [9,10,11,12]
 * ]
 * Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 * https://leetcode.com/problems/spiral-matrix/
 */
public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return Collections.emptyList();
        int n = matrix.length;
        int m = matrix[0].length;

        List<Integer> output = new ArrayList<>(n * m);

        int left = 0;
        int right = m - 1;
        int top = 0;
        int bottom = n - 1;

        while (true) {
            for (int j = left; j <= right; ++j) {
                output.add(matrix[top][j]);
            }
            ++top;
            if (top > bottom || right < left) break;
            for (int i = top; i <= bottom; ++i) {
                output.add(matrix[i][right]);
            }
            --right;
            if (top > bottom || right < left) break;
            for (int j = right; j >= left; --j) {
                output.add(matrix[bottom][j]);
            }
            --bottom;
            if (top > bottom || right < left) break;
            for (int i = bottom; i >= top; --i) {
                output.add(matrix[i][left]);
            }
            ++left;
            if (top > bottom || right < left) break;
        }
        return output;
    }

    @Test
    public void testCase1() {
        int[][] input = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        System.out.println(spiralOrder(input));
        assertThat(spiralOrder(input), is(Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5)));
    }

    @Test
    public void testCase2() {
        int[][] input = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        System.out.println(spiralOrder(input));
        assertThat(spiralOrder(input), is(Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7)));
    }
}

