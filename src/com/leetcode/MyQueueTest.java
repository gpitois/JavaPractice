package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class MyQueueTest {
    @Test
    public void useCase1() {
        MyQueue q = new MyQueue();
        Assert.assertThat(q.empty(), is(true));
        q.push(1);
        q.push(2);
        Assert.assertThat(q.empty(), is(false));
        Assert.assertThat(q.peek(), is(1));
        Assert.assertThat(q.pop(), is(1));
        Assert.assertThat(q.pop(), is(2));
        Assert.assertThat(q.empty(), is(true));
    }
}
