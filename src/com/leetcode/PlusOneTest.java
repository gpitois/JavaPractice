package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * Created by gpitois on 2/16/18.
 */
public class PlusOneTest {
    @Test
    public void useCase1() {
        int[] input = new int[]{1, 2, 4};
        int[] expected = new int[]{1, 2, 5};
        int[] output = new PlusOne().plusOne(input);

        printArray(output);
        for (int i = 0; i < expected.length; i++) {
            Assert.assertThat(output[i], is(expected[i]));
        }
    }

    @Test
    public void useCase2() {
        int[] input = new int[]{1, 2, 9};
        int[] expected = new int[]{1, 3, 0};
        int[] output = new PlusOne().plusOne(input);

        printArray(output);
        for (int i = 0; i < expected.length; i++) {
            Assert.assertThat(output[i], is(expected[i]));
        }
    }

    @Test
    public void useCase3() {
        int[] input = new int[]{0};
        int[] expected = new int[]{1};
        int[] output = new PlusOne().plusOne(input);

        printArray(output);
        for (int i = 0; i < expected.length; i++) {
            Assert.assertThat(output[i], is(expected[i]));
        }
    }

    @Test
    public void useCase4() {
        int[] input = new int[]{};
        int[] expected = new int[]{1};
        int[] output = new PlusOne().plusOne(input);

        printArray(output);
        for (int i = 0; i < expected.length; i++) {
            Assert.assertThat(output[i], is(expected[i]));
        }
    }

    private void printArray(int[] array) {
        for (int anOutput : array) {
            System.out.print(anOutput + " ");
        }
        System.out.println();
    }
}
