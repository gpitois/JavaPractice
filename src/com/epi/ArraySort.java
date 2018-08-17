package com.epi;

import java.util.Collections;
import java.util.List;

public class ArraySort {
    public static void dutchFlagPartition(int pivotIndex, List<Integer> l) {
        int pivot = l.get(pivotIndex);
        int smaller = 0, equal = 0, larger = l.size();

        while (equal < larger) {
            if (l.get(equal) < pivot) {
                Collections.swap(l, smaller++, equal++);
            } else if (l.get(equal) == pivot) {
                ++equal;
            } else {
                Collections.swap(l, equal, --larger);
            }
        }
    }
}
