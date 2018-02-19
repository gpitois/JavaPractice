package com.leetcode;


import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    public static TreeNode createTree(Integer[] a) {
        TreeNode root = new TreeNode(a[0]);
        Queue<TreeNode> fifo = new LinkedList<>();
        fifo.offer(root);
        if (a.length == 1) return root;
        int nbAtLevel = 1;
        int i = 1;
        while (i < a.length){
            for (int j = 0; j < nbAtLevel; j++){
                TreeNode node = fifo.poll();
                node.left = (null != a[i])? new TreeNode(a[i++]):null;
                node.right = (null != a[i])? new TreeNode(a[i++]):null;
                fifo.offer(node.left);
                fifo.offer(node.right);
            }
            nbAtLevel *= 2;
        }
        return root;
    }

    public static void printLeftPath(TreeNode t) {
        System.out.print("[");
        printContent(t);
        System.out.println("]");
    }

    private static void printContent(TreeNode t) {
        if (null == t) {
            System.out.print("null,");
            return;
        }
        System.out.print(t.val + ",");
        printContent(t.left);
        printContent(t.right);
    }
}
