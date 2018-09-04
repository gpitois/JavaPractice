package com.leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiplyStringsTest {
    @Test
    public void case1() {
        assertThat(MultiplyStrings.multiply("123", "2"), is("246"));
        assertThat(MultiplyStrings.multiply("555", "55"), is("30525"));
    }
}
