package com.leetcode;

public class IsPalindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x == x / 10) return true;

        int save = x;
        int rev = 0;

        while (x > 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }
        return rev == save;
    }
}
