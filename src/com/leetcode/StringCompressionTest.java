package com.leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by gpitois on 2/10/18.
 */
public class StringCompressionTest {
    @Test
    public void testCase1() {
        char[] input = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        assertThat(new StringCompression().compress(input), is(6));
    }

    @Test
    public void testCase2() {
        char[] input = new char[]{'a'};
        assertThat(new StringCompression().compress(input), is(1));
    }

    @Test
    public void testCase3() {
        char[] input = new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        assertThat(new StringCompression().compress(input), is(4));
    }

    @Test
    public void testCase4() {
        char[] input = new char[]{'a', 'c'};
        assertThat(new StringCompression().compress(input), is(2));
    }

    @Test
    public void testCase5() {
        char[] input = new char[]{'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        assertThat(new StringCompression().compress(input), is(3));
    }

    @Test
    public void testCase6() {
        char[] input = new char[]{'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'c'};
        assertThat(new StringCompression().compress(input), is(4));
    }

}
