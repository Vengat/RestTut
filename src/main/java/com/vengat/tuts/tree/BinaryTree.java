package com.vengat.tuts.tree;


import javax.xml.soap.Node;

/**
 * Created by IntelliJ IDEA.
 * User: vramanan
 * Date: 8/1/13
 * Time: 9:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class BinaryTree {
    private Node root;

    private static class Node {
        Node left;
        Node right;
        int data;

        public Node(int data) {
            left = null;
            right = null;
            this.data = data;
        }
    }

    public BinaryTree() {
        root = null;
    }

    public boolean lookup(int data) {
        return lookup(root, data);
    }

    public boolean lookup(Node node, int data) {
        boolean found = false;
        if(node == null) return false;
        if(data==node.data) return true;
        if(data < node.data) found = lookup(node.left, data);
        if(data > node.data) found = lookup(node.right, data);
        return found;
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    public Node insert(Node node, int data) {
        if(node == null) return new Node(data);
        if(data <= node.data){
            node.left = insert(node.left, data);
        } else{
            node.right = insert(node.right, data);
        }
        return node;
    }

    public int size() {
        return size(root);
    }

    public int size(Node node) {
        if(node == null) return 0;
        return 1 + size(node.left) +size(node.right);
    }

    public int maximumHeight() {
        return maximumHeight(root);
    }
    public int maximumHeight(Node node) {
        if(node == null) return 0;
        int leftHeight = maximumHeight(node.left);
        int rightHeight = maximumHeight(node.right);
        return (leftHeight > rightHeight) ? 1 + leftHeight : 1 + rightHeight;
    }

    public void preOrderTraversal() {
        preOrderTraversal(root);
    }

    public void preOrderTraversal(Node node) {
        if(node == null) return;
        System.out.println(node.data+" ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    public void inOrderTraversal(Node node) {
        if(node == null) return;
        inOrderTraversal(node.left);
        System.out.println(node.data+" ");
        inOrderTraversal(node.right);
    }

    public void postOrderTraversal() {
        postOrderTraversal(root);
    }

    public void postOrderTraversal(Node node) {
        if(node == null) return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.data);
    }

    public static void main(String[] args) {
        BinaryTree  binaryTree = new BinaryTree();
        System.out.println(binaryTree.root == null);
        binaryTree.insert(2);
        binaryTree.insert(3);
        binaryTree.insert(1);
        binaryTree.insert(4);
        System.out.println(binaryTree.size());
        System.out.println(binaryTree.maximumHeight());
    }
}
