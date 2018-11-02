package com.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/*
The set [1,2,3,...,n] contains a total of n! unique permutations.
By listing and labeling all of the permutations in order, we get the following sequence for n = 3:

"123"
"132"
"213"
"231"
"312"
"321"
Given n and k, return the kth permutation sequence.

Note:
Given n will be between 1 and 9 inclusive.
Given k will be between 1 and n! inclusive.
Example 1:

Input: n = 3, k = 3
Output: "213"
Example 2:

Input: n = 4, k = 9
Output: "2314"
*/
public class PermutationSequence {
    public static String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>(n);
        for (int i = 1; i <= n; ++i) numbers.add(i);
        StringBuilder sb = new StringBuilder();
        List<Integer> fact = new ArrayList<>(n);
        int sum = 1;
        fact.add(1);
        for (int i = 1; i < n; ++i) {
            sum *= i;
            fact.add(sum);
        }
        --k;
        for (int i = 1; i <= n; ++i) {
            int idFact = n - i;
            int idx = k / fact.get(idFact);
            sb.append(numbers.get(idx));
            k = k - idx * fact.get(idFact);
            numbers.remove(idx);
        }
        return sb.toString();
    }

    @Test
    public void testCase1() {
        assertThat(getPermutation(3, 3), is("213"));
        assertThat(getPermutation(4, 9), is("2314"));
        assertThat(getPermutation(1, 1), is("1"));
    }
}
