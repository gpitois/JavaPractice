package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gpitois on 1/1/18.
 */
public class RemoveElementTest {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }

        String result = "";
        for(int index = 0; index < length; index++) {
            int number = nums[index];
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static String integerArrayToString(int[] nums) {
        return integerArrayToString(nums, nums.length);
    }

    @Test
    public void testCase1() {
        int[] nums = new int[] {3,2,2,3};
        String solution = "[2, 2]";
        int val = 3;

        System.out.println("input: " + integerArrayToString(nums, nums.length));
        System.out.println("val: " + val);

        int ret = new RemoveElement().removeElement(nums, val);
        String out = integerArrayToString(nums, ret);
        System.out.println(out);
        Assert.assertEquals(solution, out);
    }

    @Test
    public void testCase2() {
        int[] nums = new int[] {2,2,3};
        String solution = "[2, 2]";
        int val = 3;

        System.out.println("input: " + integerArrayToString(nums, nums.length));
        System.out.println("val: " + val);

        int ret = new RemoveElement().removeElement(nums, val);
        String out = integerArrayToString(nums, ret);
        System.out.println(out);
        Assert.assertEquals(solution, out);
    }

    @Test
    public void testCase3() {
        int[] nums = new int[] {3};
        String solution = "[]";
        int val = 3;

        System.out.println("input: " + integerArrayToString(nums, nums.length));
        System.out.println("val: " + val);

        int ret = new RemoveElement().removeElement(nums, val);
        String out = integerArrayToString(nums, ret);
        System.out.println(out);
        Assert.assertEquals(solution, out);
    }

    @Test
    public void testCase4() {
        int[] nums = new int[] {};
        String solution = "[]";
        int val = 3;

        System.out.println("input: " + integerArrayToString(nums, nums.length));
        System.out.println("val: " + val);

        int ret = new RemoveElement().removeElement(nums, val);
        String out = integerArrayToString(nums, ret);
        System.out.println(out);
        Assert.assertEquals(solution, out);
    }

    @Test
    public void testCase5() {
        int[] nums = new int[] {2,2,3,3};
        String solution = "[2, 2]";
        int val = 3;

        System.out.println("input: " + integerArrayToString(nums, nums.length));
        System.out.println("val: " + val);

        int ret = new RemoveElement().removeElement(nums, val);
        String out = integerArrayToString(nums, ret);
        System.out.println(out);
        Assert.assertEquals(solution, out);
    }

    @Test
    public void testCase6() {
        int[] nums = new int[] {2};
        String solution = "[2]";
        int val = 3;

        System.out.println("input: " + integerArrayToString(nums, nums.length));
        System.out.println("val: " + val);

        int ret = new RemoveElement().removeElement(nums, val);
        String out = integerArrayToString(nums, ret);
        System.out.println(out);
        Assert.assertEquals(solution, out);
    }

    @Test
    public void testCase7() {
        int[] nums = new int[] {1,2,4,5,6};
        String solution = "[1, 2, 4, 5, 6]";
        int val = 3;

        System.out.println("input: " + integerArrayToString(nums, nums.length));
        System.out.println("val: " + val);

        int ret = new RemoveElement().removeElement(nums, val);
        String out = integerArrayToString(nums, ret);
        System.out.println(out);
        Assert.assertEquals(solution, out);
    }

    @Test
    public void testCase8() {
        int[] nums = new int[] {-3, 2};
        String solution = "[-3, 2]";
        int val = 3;

        System.out.println("input: " + integerArrayToString(nums, nums.length));
        System.out.println("val: " + val);

        int ret = new RemoveElement().removeElement(nums, val);
        String out = integerArrayToString(nums, ret);
        System.out.println(out);
        Assert.assertEquals(solution, out);
    }

}
