package com.leetcode;

import org.junit.Test;

/*
Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.

Example 1:

Input:
[
  [1,1,1],
  [1,0,1],
  [1,1,1]
]
Output:
[
  [1,0,1],
  [0,0,0],
  [1,0,1]
]
Example 2:

Input:
[
  [0,1,2,0],
  [3,4,5,2],
  [1,3,1,5]
]
Output:
[
  [0,0,0,0],
  [0,4,5,0],
  [0,3,1,0]
]
Follow up:
A straight forward solution using O(mn) space is probably a bad idea.
A simple improvement uses O(m + n) space, but still not the best solution.
Could you devise a constant space solution?
 */
public class SetMatrixZeros {
    public static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean firstRow = false, firstCol = false;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (matrix[i][j] == 0) {
                    if (i == 0) firstCol = true;
                    if (j == 0) firstRow = true;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for (int i = 1; i < n; ++i) {
            if (matrix[i][0] == 0) {
                for (int j = 0; j < m; ++j) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int j = 1; j < m; ++j) {
            if (matrix[0][j] == 0) {
                for (int i = 0; i < n; ++i) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (firstRow) for (int j = 0; j < m; ++j) matrix[0][j] = 0;
        if (firstCol) for (int i = 0; i < n; ++i) matrix[i][0] = 0;
        System.out.println(printMat(matrix));
    }

    @Test
    public void testCase1() {
        int[][] m = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes(m);
    }

    @Test
    public void testCase2() {
        int[][] m = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setZeroes(m);
    }

    private static String printMat(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            sb.append("[");
            for (int j = 0; j < m; ++j) {
                sb.append(mat[i][j]);
                if (j < m - 1) sb.append(",");
            }
            sb.append("]\n");
        }
        return sb.toString();
    }
}
