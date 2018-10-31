package com.leetcode;

import org.junit.Test;

/*
Given a positive integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

Example:
Input: 3
Output:
[
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
]
 */
public class SpiralMatrixII {
    public static int[][] generateMatrix(int n) {
        int[][] m = new int[n][n];
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int d = 0;
        int x = 0;
        int y = 0;
        for (int i = 0; i < n * n; ++i) {
            m[x][y] = i + 1;
            int[] dir = dirs[d % 4];
            int dx = dir[0];
            int dy = dir[1];
            if (-1 < (dx + x) && (dx + x) < n && -1 < (dy + y) && (dy + y) < n && m[dx + x][dy + y] == 0) {
                x = x + dx;
                y = y + dy;
            } else {
                ++d;
                dir = dirs[d % 4];
                dx = dir[0];
                dy = dir[1];
                x = x + dx;
                y = y + dy;
            }
        }
        return m;
    }

    @Test
    public void testCase1() {
        int n = 3;
        int[][] matrix = generateMatrix(n);
        for (int i = 0; i < n; ++i) {
            System.out.print("[");
            for (int j = 0; j < n; ++j) {
                String end = (j == n - 1) ? "" : " ";
                System.out.print(matrix[i][j] + end);
            }
            System.out.println("]");
        }
    }
}
