package com.leetcode;

/**
 * Given a binary tree, determine if it is height-balanced.
 * For this problem, a height-balanced binary tree is defined as:
 * a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 */
/*
 Example 1:
 Given the following tree [3,9,20,null,null,15,7]:
      3
     / \
    9  20
      /  \
     15   7
 Return true.

 Example 2:
 Given the following tree [1,2,2,3,3,null,null,4,4]:
       1
      / \
     2   2
    / \
   3   3
  / \
 4   4
 Return false.
 */

public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        Result result = controlBalanced(root);
        return result.isBalanced;
    }

    private Result controlBalanced(TreeNode node) {
        if (null == node) return new Result(true, 0);
        Result left = controlBalanced(node.left);
        Result right = controlBalanced(node.right);
        if (!left.isBalanced) return left;
        if (!right.isBalanced) return right;
        if (Math.abs(left.height - right.height) <= 1) {
            return new Result(true, Math.max(left.height, right.height));
        }
        return new Result(false, 0);
    }

    static class Result {
        boolean isBalanced;
        int height;

        Result(boolean b, int h) {
            isBalanced = b;
            height = h;
        }
    }

}
