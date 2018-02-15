package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * Created by gpitois on 2/14/18.
 */
public class RemoveDuplicatesTest {
    @Test
    public void useCase1() {
        int [] array = new int[]{1,2,2,2,3};
        Assert.assertThat(new RemoveDuplicates().removeDuplicates(array), is(3));
    }

    @Test
    public void useCase2() {
        int [] array = new int[]{1,1,1};
        Assert.assertThat(new RemoveDuplicates().removeDuplicates(array), is(1));
    }

    @Test
    public void useCase3() {
        int [] array = new int[]{1,2,3,4};
        Assert.assertThat(new RemoveDuplicates().removeDuplicates(array), is(4));
    }

    @Test
    public void useCase4() {
        int [] array = new int[]{1,1,2,2,2,2,2};
        Assert.assertThat(new RemoveDuplicates().removeDuplicates(array), is(2));
    }

    @Test
    public void useCase5() {
        int [] array = new int[]{2,2,2,3};
        Assert.assertThat(new RemoveDuplicates().removeDuplicates(array), is(2));
    }

}
