package com.leetcode;

/**
 * Created by gpitois on 1/1/18.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int l = nums.length;
        if (l <= 0) return 0;
        int last = nums.length - 1;
        for (int i = 0; i < l; i++) {
            if (nums[i] == val) {
                // if there is no other value than val in the rest of the table, then return early
                // move an element not equal to val to replace current element
                while (nums[last] == val && i < last) {
                    last--;
                    l--;
                }
                // decrease size by 1
                l--;
                // if there is no other value than val in the rest of the table, then return early
                if (last <= i) return l;
                nums[i] = nums[last];
                nums[last] = val;
                last--;
            }
        }
        return l;
    }
}
