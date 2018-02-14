package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * Created by gpitois on 2/13/18.
 */
public class IsIsomorphicTest {
    @Test
    public void useCase1() {
        Assert.assertThat(new IsIsomorphic().isIsomorphic("egg", "add"), is(true));
    }

    @Test
    public void useCase2() {
        Assert.assertThat(new IsIsomorphic().isIsomorphic("foo", "bar"), is(false));
    }

    @Test
    public void useCase3() {
        Assert.assertThat(new IsIsomorphic().isIsomorphic("paper", "title"), is(true));
    }

    @Test
    public void useCase4() {
        Assert.assertThat(new IsIsomorphic().isIsomorphic("ab", "aa"), is(false));
    }
}
