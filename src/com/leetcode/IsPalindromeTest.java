package com.leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class IsPalindromeTest {
    @Test
    public void case1() {
        assertThat(IsPalindrome.isPalindrome(121), is(true));
        assertThat(IsPalindrome.isPalindrome(-121), is(false));
        assertThat(IsPalindrome.isPalindrome(-10), is(false));
        assertThat(IsPalindrome.isPalindrome(0), is(true));
        assertThat(IsPalindrome.isPalindrome(1), is(true));
        assertThat(IsPalindrome.isPalindrome(2), is(true));
        assertThat(IsPalindrome.isPalindrome(10), is(false));
        assertThat(IsPalindrome.isPalindrome(110), is(false));
        assertThat(IsPalindrome.isPalindrome(1111111), is(true));
        assertThat(IsPalindrome.isPalindrome(111111), is(true));
        assertThat(IsPalindrome.isPalindrome(1000021), is(false));
    }
}
