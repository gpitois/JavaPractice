package com.leetcode;

/**
 * Created by gpitois on 1/4/18.
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (null == l1) return l2;
        if (null == l2) return l1;

        return addNext(l1, l2);
    }

    private ListNode addNext(ListNode a, ListNode b) {
        if (null == a && null == b) {
            return null;
        }
        ListNode l;
        if (null == a) {
            l = new ListNode(b.val);
            l.next = addNext(b.next, null);
        } else if (null == b) {
            l = new ListNode(a.val);
            l.next = addNext(a.next, null);
        } else if (a.val <= b.val) {
            l = new ListNode(a.val);
            l.next = addNext(a.next, b);
        } else {
            l = new ListNode(b.val);
            l.next = addNext(a, b.next);
        }
        return l;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}


