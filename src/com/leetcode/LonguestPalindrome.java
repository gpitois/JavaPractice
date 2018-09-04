/*
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"
 */
public class LonguestPalindrome {
    public static String longestPalindrome(String s) {
        if (s.length() == 0) return "";
        int n = s.length();
        int maxStart = 0;
        int maxEnd = 0;
        boolean pal[][] = new boolean[n][n];
        for (int i = 0; i < n; ++i) {
            pal[i][i] = true;
        }
        for (int i = 0; i < n - 1; ++i) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                pal[i][i + 1] = true;
                maxStart = i;
                maxEnd = i + 1;
            }
        }
        for (int gap = 2; gap < n; ++gap) {
            // Check substring between i and j (j = i+gap), by comparing the extremities. The center part has already
            // been checked for by previous loops.
            for (int i = 0; i < n - gap; ++i) {
                int j = i + gap;
                if (pal[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) {
                    pal[i][j] = true;
                    maxStart = i;
                    maxEnd = j;
                }
            }
        }
        return s.substring(maxStart, maxEnd + 1);
    }
}
