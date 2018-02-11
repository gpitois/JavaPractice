package com.leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by gpitois on 2/8/18.
 */
public class LinkedListCycleTest {
    @Test
    public void testCase1() {
        LinkedListCycle.ListNode l = new LinkedListCycle.ListNode(1);
        LinkedListCycle.ListNode start = l;
        l.next = new LinkedListCycle.ListNode(2); l = l.next;
        LinkedListCycle.ListNode cycle = l;
        l.next = new LinkedListCycle.ListNode(3); l = l.next;
        l.next = new LinkedListCycle.ListNode(4); l = l.next;
        l.next = new LinkedListCycle.ListNode(5); l.next = cycle;

        assertThat(new LinkedListCycle().hasCycle(start), is(true));
    }

    @Test
    public void testCase2() {
        LinkedListCycle.ListNode l = new LinkedListCycle.ListNode(1);
        LinkedListCycle.ListNode start = l;
        l.next = new LinkedListCycle.ListNode(2); l = l.next;
        l.next = new LinkedListCycle.ListNode(3); l = l.next;
        l.next = new LinkedListCycle.ListNode(4); l = l.next;
        l.next = new LinkedListCycle.ListNode(5);

        assertThat(new LinkedListCycle().hasCycle(start), is(false));
    }

    @Test
    public void testCase3() {
        LinkedListCycle.ListNode l = new LinkedListCycle.ListNode(1);
        LinkedListCycle.ListNode start = l;
        l.next = new LinkedListCycle.ListNode(2); l = l.next;
        LinkedListCycle.ListNode cycle = l;
        l.next = new LinkedListCycle.ListNode(3); l = l.next;
        l.next = new LinkedListCycle.ListNode(4); l.next = cycle;

        assertThat(new LinkedListCycle().hasCycle(start), is(true));
    }

    @Test
    public void testCase4() {
        LinkedListCycle.ListNode l = new LinkedListCycle.ListNode(1);
        LinkedListCycle.ListNode start = l;

        assertThat(new LinkedListCycle().hasCycle(start), is(false));
    }

    @Test
    public void testCase5() {
        LinkedListCycle.ListNode l = new LinkedListCycle.ListNode(1);
        LinkedListCycle.ListNode start = l;
        l.next = new LinkedListCycle.ListNode(2); l = l.next;

        assertThat(new LinkedListCycle().hasCycle(start), is(false));
    }

    @Test
    public void testCase6() {
        LinkedListCycle.ListNode l = new LinkedListCycle.ListNode(1);
        LinkedListCycle.ListNode start = l;
        l.next = new LinkedListCycle.ListNode(2); l = l.next;
        l.next = new LinkedListCycle.ListNode(3); l = l.next;

        assertThat(new LinkedListCycle().hasCycle(start), is(false));
    }
}
