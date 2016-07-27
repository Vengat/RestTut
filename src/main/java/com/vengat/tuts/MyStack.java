package com.vengat.tuts;

/**
 * Created by IntelliJ IDEA.
 * User: vramanan
 * Date: 7/1/13
 * Time: 2:33 PM
 * To change this template use File | Settings | File Templates.
 *
 * This is a first in last out data structure
 * so first in cannot be retrieved unless the second in is retrieved
 */
public class MyStack {

    private int[] header;
    private int pointer;

    public MyStack(int capacity) {
        int[] header = new int[capacity];
        pointer = -1;
    }

    public boolean isEmpty() {
        return pointer == -1;
    }

    public void push(int i) {
        if(pointer >= header.length) return;
        header[++pointer] = i;
    }

    public int pop() {
        if(isEmpty()) return 0;
        return header[pointer--];
    }


}
