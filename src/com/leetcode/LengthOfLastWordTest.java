package com.leetcode;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by gpitois on 1/6/18.
 */
public class LengthOfLastWordTest {

    @Test
    public void testCase1() {
        String input = "Hello World";
        assertThat(new LengthOfLastWord().lengthOfLastWord(input), is(5));
    }

    @Test
    public void testCase2() {
        String input = "";
        assertThat(new LengthOfLastWord().lengthOfLastWord(input), is(0));
    }

    @Test
    public void testCase3() {
        String input = "Hello ";
        assertThat(new LengthOfLastWord().lengthOfLastWord(input), is(5));
    }

    @Test
    public void testCase4() {
        String input = "abcd";
        assertThat(new LengthOfLastWord().lengthOfLastWord(input), is(4));
    }

    @Test
    public void testCase5() {
        String input = " abcd";
        assertThat(new LengthOfLastWord().lengthOfLastWord(input), is(4));
    }

}
