package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * Created by gpitois on 1/4/18.
 */
public class MergeTwoSortedListsTest {

    public static String printList(MergeTwoSortedLists.ListNode l) {
        if (null == l) {
            return "";
        }
        return String.valueOf(l.val) + printList(l.next);
    }

    public static MergeTwoSortedLists.ListNode getList(int[] values, int i) {
        if (i >= values.length) {
            return null;
        }
        MergeTwoSortedLists.ListNode output = new MergeTwoSortedLists.ListNode(values[i]);
        output.next = getList(values, i + 1);
        return output;
    }

    @Test
    public void useCase1() {
        String expected = "112344";
        MergeTwoSortedLists.ListNode list1 = getList(new int[] {1,2,4}, 0);
        MergeTwoSortedLists.ListNode list2 = getList(new int[] {1,3,4}, 0);

        System.out.println(printList(list1));
        System.out.println(printList(list2));

        MergeTwoSortedLists.ListNode result = new MergeTwoSortedLists().mergeTwoLists(list1, list2);
        System.out.println(printList(result));
        Assert.assertThat(printList(result), is(expected));
    }

    @Test
    public void useCase2() {
        String expected = "124";
        MergeTwoSortedLists.ListNode list1 = getList(new int[] {1,2,4}, 0);
        MergeTwoSortedLists.ListNode list2 = null;

        System.out.println(printList(list1));
        System.out.println(printList(list2));

        MergeTwoSortedLists.ListNode result = new MergeTwoSortedLists().mergeTwoLists(list1, list2);
        System.out.println(printList(result));
        Assert.assertThat(printList(result), is(expected));
    }

    @Test
    public void useCase3() {
        String expected = "134";
        MergeTwoSortedLists.ListNode list1 = null;
        MergeTwoSortedLists.ListNode list2 = getList(new int[] {1,3,4}, 0);

        System.out.println(printList(list1));
        System.out.println(printList(list2));

        MergeTwoSortedLists.ListNode result = new MergeTwoSortedLists().mergeTwoLists(list1, list2);
        System.out.println(printList(result));
        Assert.assertThat(printList(result), is(expected));
    }

    @Test
    public void useCase4() {
        String expected = "1123445";
        MergeTwoSortedLists.ListNode list1 = getList(new int[] {1,2,4,5}, 0);
        MergeTwoSortedLists.ListNode list2 = getList(new int[] {1,3,4}, 0);

        System.out.println(printList(list1));
        System.out.println(printList(list2));

        MergeTwoSortedLists.ListNode result = new MergeTwoSortedLists().mergeTwoLists(list1, list2);
        System.out.println(printList(result));
        Assert.assertThat(printList(result), is(expected));
    }

    @Test
    public void useCase5() {
        String expected = "";
        MergeTwoSortedLists.ListNode list1 = null;
        MergeTwoSortedLists.ListNode list2 = null;

        System.out.println(printList(list1));
        System.out.println(printList(list2));

        MergeTwoSortedLists.ListNode result = new MergeTwoSortedLists().mergeTwoLists(list1, list2);
        System.out.println(printList(result));
        Assert.assertThat(printList(result), is(expected));
    }

    @Test
    public void useCase6() {
        String expected = "11";
        MergeTwoSortedLists.ListNode list1 = getList(new int[] {1}, 0);
        MergeTwoSortedLists.ListNode list2 = getList(new int[] {1}, 0);

        System.out.println(printList(list1));
        System.out.println(printList(list2));

        MergeTwoSortedLists.ListNode result = new MergeTwoSortedLists().mergeTwoLists(list1, list2);
        System.out.println(printList(result));
        Assert.assertThat(printList(result), is(expected));
    }

    @Test
    public void useCase7() {
        String expected = "1111222";
        MergeTwoSortedLists.ListNode list1 = getList(new int[] {1,1,1,1}, 0);
        MergeTwoSortedLists.ListNode list2 = getList(new int[] {2,2,2}, 0);

        System.out.println(printList(list1));
        System.out.println(printList(list2));

        MergeTwoSortedLists.ListNode result = new MergeTwoSortedLists().mergeTwoLists(list1, list2);
        System.out.println(printList(result));
        Assert.assertThat(printList(result), is(expected));
    }

    @Test
    public void useCase8() {
        String expected = "1111222";
        MergeTwoSortedLists.ListNode list1 = getList(new int[] {2,2,2}, 0);
        MergeTwoSortedLists.ListNode list2 = getList(new int[] {1,1,1,1}, 0);

        System.out.println(printList(list1));
        System.out.println(printList(list2));

        MergeTwoSortedLists.ListNode result = new MergeTwoSortedLists().mergeTwoLists(list1, list2);
        System.out.println(printList(result));
        Assert.assertThat(printList(result), is(expected));
    }
}
