package com.leetcode;

import org.junit.Test;

import java.util.*;

/*
Given a collection of intervals, merge all overlapping intervals.

Example 1:
Input: [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].

Example 2:
Input: [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considerred overlapping.

https://leetcode.com/problems/merge-intervals/description/
 */
public class MergeIntervals {
    public static List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() <= 1) return intervals;
        // sort the list by start value
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return Integer.compare(o1.start, o2.start);
            }
        });

        List<Interval> output = new ArrayList<>();
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for (Interval i : intervals) {
            if (end < i.start) {
                output.add(new Interval(start, end));
                start = i.start;
                end = i.end;
            } else {
                end = Math.max(end, i.end);
            }
        }
        output.add(new Interval(start, end));


        return output;
    }

    @Test
    public void test1() {
        Interval i1 = new Interval(1, 3);
        Interval i2 = new Interval(2, 6);
        Interval i3 = new Interval(8, 10);
        Interval i4 = new Interval(15, 18);
        List<Interval> l = Arrays.asList(i1, i2, i3, i4);
        List<Interval> out = merge(l);
        System.out.println(out);
    }

    @Test
    public void test2() {
        Interval i1 = new Interval(1, 4);
        Interval i2 = new Interval(4, 5);
        List<Interval> l = Arrays.asList(i1, i2);
        List<Interval> out = merge(l);
        System.out.println(out);
    }
}
