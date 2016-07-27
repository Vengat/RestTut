package com.vengat.tuts;

/**
 * Created by IntelliJ IDEA.
 * User: vramanan
 * Date: 7/1/13
 * Time: 2:47 PM
 * To change this template use File | Settings | File Templates.
 *
 * A queue is a FIFO...Whatever enters first exits first
 */
public class MyQueue {

    private int[] head;
    private int start, end;
    private boolean full;

    public MyQueue(int capacity) {
        head = new int[capacity];
        start = end = 0;
        full = false;
    }

    public boolean isEmpty() {
        return start == end && !full;
    }

    public void insert(int i) {
        head[++start] = i;
        if(start == end) full = true;
    }
}
