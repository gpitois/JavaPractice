package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;

public class IsBalancedTest {

    @Test
    public void useCase1() {
        Integer[] ai = new Integer[]{3,9,20,null,null,15,7};
        TreeNode t = TreeNode.createTree(ai);
        TreeNode.printLeftPath(t);
        Assert.assertThat(new IsBalanced().isBalanced(t), is(true));
    }

    @Test
    public void useCase2() {
        Integer[] ai = new Integer[]{1,2,2,3,3,null,null,4,4};
        TreeNode t = TreeNode.createTree(ai);
        TreeNode.printLeftPath(t);
        Assert.assertThat(new IsBalanced().isBalanced(t), is(false));
    }
}
