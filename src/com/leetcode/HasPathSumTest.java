package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class HasPathSumTest {
    @Test
    public void useCase1() {
        TreeNode input = createTree1();
        Assert.assertThat(new HasPathSum().hasPathSum(input, 22), is(true));
    }

    TreeNode createTree1() {
        TreeNode t = new TreeNode(5);
        t.left = new TreeNode(4);
        t.right = new TreeNode(8);
        t.left.left = new TreeNode(11);
        t.right.left = new TreeNode(13);
        t.right.right = new TreeNode(4);
        t.left.left.left = new TreeNode(7);
        t.left.left.right = new TreeNode(2);
        t.right.right.right = new TreeNode(1);
        return t;
    }

    @Test
    public void useCase2() {
        TreeNode input = createTree2();
        Assert.assertThat(new HasPathSum().hasPathSum(input, 22), is(false));
    }

    TreeNode createTree2() {
        TreeNode t = new TreeNode(5);
        t.left = new TreeNode(4);
        t.right = new TreeNode(8);
        t.left.left = new TreeNode(11);
        t.right.left = new TreeNode(13);
        t.right.right = new TreeNode(4);
        t.left.left.left = new TreeNode(7);
        t.left.left.right = new TreeNode(20);
        t.right.right.right = new TreeNode(1);
        return t;
    }

    @Test
    public void useCase3() {
        TreeNode input = createTree3();
        Assert.assertThat(new HasPathSum().hasPathSum(input, -5), is(true));
    }

    TreeNode createTree3() {
        TreeNode t = new TreeNode(-2);
        t.right = new TreeNode(-3);
        return t;
    }
}
