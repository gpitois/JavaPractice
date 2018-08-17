package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class UglyNumberTest {
    @Test
    public void basicCases() {
        Assert.assertThat(UglyNumber.isUgly(1), is(true));
        Assert.assertThat(UglyNumber.isUgly(8), is(true));
        Assert.assertThat(UglyNumber.isUgly(14), is(false));
        Assert.assertThat(UglyNumber.isUgly(7), is(false));
        Assert.assertThat(UglyNumber.isUgly(5), is(true));
    }
}
