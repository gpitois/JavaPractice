package com.leetcode;

class MyQueue {

    private Node head;
    private Node tail;
    private int size = 0;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        head = tail = null;
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        if (size == 0) {
            head = new Node();
            head.val = x;
            tail = head;
        } else {
            Node item = new Node();
            item.val = x;
            tail.next = item;
            tail = item;
        }
        size++;
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (size == 0) return 0;
        int val = head.val;
        head = head.next;
        size--;
        return val;
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (size == 0) return 0;
        return head.val;
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return size == 0;
    }

    static class Node {
        int val;
        Node next;
    }
}