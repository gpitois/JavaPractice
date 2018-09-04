package com.leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class IntToRomanTest {
    @Test
    public void case1() {
        assertThat(IntToRoman.intToRoman(3), is("III"));
        assertThat(IntToRoman.intToRoman(4), is("IV"));
        assertThat(IntToRoman.intToRoman(9), is("IX"));
        assertThat(IntToRoman.intToRoman(58), is("LVIII"));
    }
}
