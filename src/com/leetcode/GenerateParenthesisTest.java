package com.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GenerateParenthesisTest {
    @Test
    public void case1() {
        List<String> expected = new ArrayList<>();
        expected.add("((()))");
        expected.add("(()())");
        expected.add("(())()");
        expected.add("()(())");
        expected.add("()()()");
        assertThat(GenerateParenthesis.generateParenthesis(3), is(expected));
    }
}
