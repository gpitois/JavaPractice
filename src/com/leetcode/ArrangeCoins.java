package com.leetcode;

/**
 * Created by gpitois on 2/6/18.
 */
public class ArrangeCoins {
    public int arrangeCoins(int n) {
        if (n < 0) return -1;
        if (n == 0) return 0;
        int completeStairs = 0;
        int level = 1;
        do {
            n = n - level;
            level++;
            completeStairs++;
        } while (n >= level);
        return completeStairs;
    }
}
