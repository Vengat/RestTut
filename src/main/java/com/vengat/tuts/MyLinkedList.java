package com.vengat.tuts;


public class MyLinkedList {
    protected ChildNode head;
    protected int number;

    public MyLinkedList() {
        head = null;
        number = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return number;
    }

    public void insert(Object data) {
        head = new ChildNode(data, head);
        number++;
    }

    public Object remove(){
        if(isEmpty()) return null;
        number--;
        return head.nextNode;
    }
}
