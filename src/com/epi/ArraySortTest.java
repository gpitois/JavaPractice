package com.epi;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ArraySortTest {

    @Test
    public void dutchFlagPartitionTest1() {
        List<Integer> l = Arrays.asList(-3, 0, 1, 2, 1, 0, -2, 0, 0, 3, 1, 1);
        ArraySort.dutchFlagPartition(2, l);
        System.out.println(l);
    }

    @Test
    public void dutchFlagPartitionTest2() {
        List<Integer> l = Arrays.asList(-3, 0, 1, 2, 1, 0, -2, 0, 0, 3, 1, 1);
        ArraySort.dutchFlagPartition(1, l);
        System.out.println(l);
    }
}
