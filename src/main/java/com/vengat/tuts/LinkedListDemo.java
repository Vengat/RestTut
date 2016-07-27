package com.vengat.tuts;

import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA.
 * User: vramanan
 * Date: 7/27/13
 * Time: 11:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<Integer> linkedListTest = new LinkedList<Integer>();
        linkedListTest.add(1);
        linkedListTest.add(2);
        linkedListTest.add(3);
        linkedListTest.add(4);
        linkedListTest.add(5);

        System.out.println(linkedListTest.poll());
    }
}
