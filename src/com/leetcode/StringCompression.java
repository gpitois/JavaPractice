package com.leetcode;

/**
 * Given an array of characters, compress it in-place.
 * The length after compression must always be smaller than or equal to the original array.
 * Every element of the array should be a character (not int) of length 1.
 * After you are done modifying the input array in-place, return the new length of the array.
 */
public class StringCompression {
    public int compress(char[] chars) {
        if (chars.length == 0) return 0;
        int newLength = lengthCompress(chars);
        if (newLength > chars.length) {
            return chars.length;
        }
        compressInPlace(chars);
        return newLength;
    }

    private int lengthCompress(char[] chars) {
        char c = chars[0];
        int newLength = 0;
        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if (c == chars[i]) {
                // Compress
                count++;
                continue;
            }
            newLength += (count == 1) ? 1 : 1 + getLengthOfInt(count);
            c = chars[i];
            count = 1;
        }
        newLength += (count == 1) ? 1 : 1 + getLengthOfInt(count);
        return newLength;
    }

    private int getLengthOfInt(int x) {
        if (x < 10) return 1;
        if (x < 100) return 2;
        if (x < 1000) return 3;
        return 4;
    }

    private void compressInPlace(char[] chars) {
        char c = chars[0];
        int cursor = 0;
        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if (c == chars[i]) {
                count++;
                continue;
            }
            chars[cursor++] = c;
            c = chars[i];
            if (count > 1) {
                cursor = writeCount(chars, count, cursor);
            }
            count = 1;
        }
        chars[cursor++] = c;
        if (count > 1) {
            writeCount(chars, count, cursor);
        }
    }

    private int writeCount(char[] chars, int value, int it) {
        int offset = 0;
        int backMove = 0;
        if (value >= 1000) {
            offset = 3;
        } else if (value >= 100) {
            offset = 2;
        } else if (value >= 10) {
            offset = 1;
        }
        int newEnd = it + offset;
        int digit = value % 10;
        chars[newEnd - backMove++] = (char) (digit + '0');
        int remain = value / 10;
        while (remain > 0) {
            digit = remain % 10;
            chars[newEnd - backMove++] = (char) (digit + '0');
            remain = remain / 10;
        }
        return newEnd + 1;
    }
}
