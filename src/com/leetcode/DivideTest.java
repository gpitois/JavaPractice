package com.leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DivideTest {
    @Test
    public void case1() {
        assertThat(Divide.divide(10, 3), is(3));
        assertThat(Divide.divide(7, -3), is(-2));
        assertThat(Divide.divide(-2147483648, -1), is(2147483647));
    }


}

