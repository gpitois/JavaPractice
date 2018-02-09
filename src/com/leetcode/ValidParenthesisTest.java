package com.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by gpitois on 1/8/18.
 */
public class ValidParenthesisTest {

    @Test
    public void testCase1() {
        String input = "()";
        assertTrue(new ValidParenthesis().isValid(input));
    }

    @Test
    public void testCase2() {
        String input = "([])";
        assertTrue(new ValidParenthesis().isValid(input));
    }

    @Test
    public void testCase3() {
        String input = "()()";
        assertTrue(new ValidParenthesis().isValid(input));
    }

    @Test
    public void testCase4() {
        String input = "([])()";
        assertTrue(new ValidParenthesis().isValid(input));
    }

    @Test
    public void testCase5() {
        String input = "";
        assertTrue(new ValidParenthesis().isValid(input));
    }

    @Test
    public void testCase6() {
        String input = "({)}";
        assertFalse(new ValidParenthesis().isValid(input));
    }

    @Test
    public void testCase7() {
        String input = "}{";
        assertFalse(new ValidParenthesis().isValid(input));
    }

    @Test
    public void testCase8() {
        String input = "()}";
        assertFalse(new ValidParenthesis().isValid(input));
    }
}
