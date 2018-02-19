package com.leetcode;

import java.util.*;

/**
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 * ....3
 * .../ \
 * ..9  20
 * ..../  \
 * ...15   7
 * return its bottom-up level order traversal as:
 * [
 * [15,7],
 * [9,20],
 * [3]
 * ]
 */
public class LevelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (null == root) return Collections.EMPTY_LIST;
        Queue<TreeNode> fifoNodes = new LinkedList<>();
        Deque<List<Integer>> output = new LinkedList<>();
        fifoNodes.offer(root);
        while (!fifoNodes.isEmpty()) {
            Queue<TreeNode> localFifo = new LinkedList<>();
            do {
                localFifo.offer(fifoNodes.poll());
            } while (!fifoNodes.isEmpty());
            List<Integer> currentLevel = new ArrayList<>();
            do {
                TreeNode node = localFifo.poll();
                currentLevel.add(node.val);
                if (null != node.left) fifoNodes.offer(node.left);
                if (null != node.right) fifoNodes.offer(node.right);
            } while (!localFifo.isEmpty());
            output.addFirst(currentLevel);
        }
        return (List) output;
    }
}
