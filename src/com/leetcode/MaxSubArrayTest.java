package com.leetcode;


import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class MaxSubArrayTest {
    @Test
    public void useCase1() {
        int[] a = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Assert.assertThat(new MaxSubArray().maxSubArray(a), is(6));
    }
}
