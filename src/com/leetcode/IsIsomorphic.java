package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character but a character may map to itself.
 * For example,
 * Given "egg", "add", return true.
 * Given "foo", "bar", return false.
 * Given "paper", "title", return true.
 * Note:
 * You may assume both s and t have the same length.
 */
public class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        Map<Character, Character> replaceWith = new HashMap<>();

        for (int i = 0; i < sa.length; i++) {
            if (!replaceWith.containsKey(sa[i])) {
                if (replaceWith.containsValue(ta[i])) return false;
                replaceWith.put(sa[i], ta[i]);
            }
            if (replaceWith.get(sa[i]) != ta[i]) return false;
        }
        return true;
    }
}
