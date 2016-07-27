package com.vengat.tuts.tree;


import javax.xml.soap.Node;

/**
 * Created by IntelliJ IDEA.
 * User: vramanan
 * Date: 8/2/13
 * Time: 7:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class SecondBinaryTree {

    private Node root;

    private static class Node {
        Node left, right;
        int data;
        public Node(int data) {
            this.left = null;
            this.right = null;
            this.data = data;
        }
    }

}
