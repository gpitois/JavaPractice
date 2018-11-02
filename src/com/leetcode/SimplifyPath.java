package com.leetcode;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Given an absolute path for a file (Unix-style), simplify it.
 * <p>
 * For example,
 * path = "/home/", => "/home"
 * path = "/a/./b/../../c/", => "/c"
 * path = "/a/../../b/../c//.//", => "/c"
 * path = "/a//b////c/d//././/..", => "/a/b/c"
 * <p>
 * In a UNIX-style file system, a period ('.') refers to the current directory, so it can be ignored in a simplified path. Additionally, a double period ("..") moves up a directory, so it cancels out whatever the last directory was. For more information, look here: https://en.wikipedia.org/wiki/Path_(computing)#Unix_style
 * <p>
 * Corner Cases:
 * Did you consider the case where path = "/../"?
 * In this case, you should return "/".
 * Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".
 * In this case, you should ignore redundant slashes and return "/home/foo".
 */
public class SimplifyPath {
    public static String simplifyPath(String path) {
        Deque<String> dirs = new ArrayDeque<>();
        String[] folders = path.split("/");
        for (String s : folders) {
            if (s.equals("..")) {
                if (!dirs.isEmpty())
                    dirs.removeLast();
            } else if (!s.equals(".") && s.trim().length() > 0) {
                dirs.addLast(s);
            }
        }
        if (dirs.isEmpty()) return "/";
        StringBuilder sb = new StringBuilder();
        for (String folder : dirs) {
            sb.append("/").append(folder);
        }
        return sb.toString();
    }

    @Test
    public void testCase1() {
        assertThat(simplifyPath("/home/"), is("/home"));
        assertThat(simplifyPath("/a/./b/../../c//"), is("/c"));
        assertThat(simplifyPath("/a//b////c/d//././/.."), is("/a/b/c"));
        assertThat(simplifyPath("/a/../../b/../c//.//"), is("/c"));
        assertThat(simplifyPath("/../"), is("/"));
    }
}

