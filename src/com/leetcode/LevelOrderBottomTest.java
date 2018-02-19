package com.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;

public class LevelOrderBottomTest {
    @Test
    public void useCase1() {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7};
        Integer[] ai = Arrays.stream(a).boxed().toArray(Integer[]::new);
        TreeNode t = TreeNode.createTree(ai);
        TreeNode.printLeftPath(t);
        List<List<Integer>> l = new LevelOrderBottom().levelOrderBottom(t);
        printTreeList(l);
    }


    private void printTreeList(List<List<Integer>> l) {
        System.out.println("[");
        for (List<Integer> integerList : l) {
            System.out.print("[");
            for (Integer myInt : integerList) {
                System.out.print(myInt + ",");
            }
            System.out.println("],");
        }
        System.out.println("]");
    }
}
