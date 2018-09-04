package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
 */
public class GenerateParenthesis {
    public static List<String> generateParenthesis(int n) {
        List<String> out = new ArrayList<>();
        StringBuilder curr = new StringBuilder();
        generateHelper(out, curr, n, n);
        return out;
    }

    static void generateHelper(List<String> output, StringBuilder current, int left, int right) {
        if (left == 0 && right == 0) {
            output.add(new String(current));
            return;
        }
        if (left > 0) {
            current.append("(");
            generateHelper(output, current, left - 1, right);
            current.deleteCharAt(current.length() - 1);
        }
        if (right > left) {
            current.append(")");
            generateHelper(output, current, left, right - 1);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
