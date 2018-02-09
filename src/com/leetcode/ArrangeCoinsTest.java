package com.leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by gpitois on 2/6/18.
 */
public class ArrangeCoinsTest {
    @Test
    public void testCase1() {
        int input = 0;
        assertThat(new ArrangeCoins().arrangeCoins(input), is(0));
    }
    @Test
    public void testCase2() {
        int input = 1;
        assertThat(new ArrangeCoins().arrangeCoins(input), is(1));
    }
    @Test
    public void testCase3() {
        int input = 3;
        assertThat(new ArrangeCoins().arrangeCoins(input), is(2));
    }
    @Test
    public void testCase4() {
        int input = 5;
        assertThat(new ArrangeCoins().arrangeCoins(input), is(2));
    }
}
