package com.leetcode;

/**
 * Created by gpitois on 1/6/18.
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int l = s.length();
        if (l == 0) return 0;
        int p = l - 1, k;
        while (p >= 0 && s.charAt(p) == ' ') {
            p--;
        }
        k = p;
        while (p >= 0 && s.charAt(p) != ' ') {
            p--;
        }
        return k - p;
    }
}
