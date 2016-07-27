package com.vengat.tuts.binarytree;

/**
 * Created by IntelliJ IDEA.
 * User: vramanan
 * Date: 7/25/13
 * Time: 8:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class BinaryTreeNode {

    /**
     * A binary tree node consists of a data value
     * A pointer to a left node
     * A pointer to a right node
     */

    public BinaryTreeNode leftNode;
    public BinaryTreeNode rightNode;
    public int data;

    public BinaryTreeNode(BinaryTreeNode leftNode, BinaryTreeNode rightNode, int data) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.data = data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void setLeftNode(BinaryTreeNode leftNode, int data) {
        this.leftNode = leftNode;
        this.leftNode.setData(data);
    }

    public BinaryTreeNode getLeftNode() {
        return this.leftNode;
    }

    public void setRightNode(BinaryTreeNode rightNode, int data) {
        this.rightNode = rightNode;
        this.rightNode.setData(data);
    }

    public BinaryTreeNode getRightNode() {
        return this.rightNode;
    }
}
