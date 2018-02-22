package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;

public class SubStrTest {
    @Test
    public void useCase1() {
        String input = "hello";
        String sub = "ll";
        Assert.assertThat(new SubStr().strStr(input, sub), is(2));
    }

    @Test
    public void useCase2() {
        String input = "aaaaa";
        String sub = "bba";
        Assert.assertThat(new SubStr().strStr(input, sub), is(-1));
    }

    @Test
    public void useCase3() {
        String input = "aaaaa";
        String sub = "aa";
        Assert.assertThat(new SubStr().strStr(input, sub), is(0));
    }

    @Test
    public void useCase4() {
        String input = "xxxxa";
        String sub = "a";
        Assert.assertThat(new SubStr().strStr(input, sub), is(4));
    }

    @Test
    public void useCase5() {
        String input = "dddd";
        String sub = "ddddd";
        Assert.assertThat(new SubStr().strStr(input, sub), is(-1));
    }

    @Test
    public void useCase6() {
        String input = "dddd";
        String sub = "";
        Assert.assertThat(new SubStr().strStr(input, sub), is(0));
    }

    @Test
    public void useCase7() {
        String input = "";
        String sub = "";
        Assert.assertThat(new SubStr().strStr(input, sub), is(0));
    }

    @Test
    public void useCase8() {
        String input = "ababcab";
        String sub = "abc";
        Assert.assertThat(new SubStr().strStr(input, sub), is(2));
    }

    @Test
    public void useCase9() {
        String input = "mississippi";
        String sub = "issipi";
        Assert.assertThat(new SubStr().strStr(input, sub), is(-1));
    }

    @Test
    public void useCase10() {
        String input = "mississippi";
        String sub = "issip";
        Assert.assertThat(new SubStr().strStr(input, sub), is(4));
    }
}