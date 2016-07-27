package com.vengat.tuts.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by IntelliJ IDEA.
 * User: vramanan
 * Date: 7/25/13
 * Time: 8:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyBinaryTree {

    private BinaryTreeNode rootNode;
    private boolean rootNodeSet = false;
    private int data;

    public MyBinaryTree() {
        this.rootNode = null;
    }

    public MyBinaryTree(int data) {
        this.data = data;
        rootNode = new BinaryTreeNode(null, null, this.data);
    }

    public void setRootNode(BinaryTreeNode rootNode, int data) {
        this.rootNode = rootNode;
        this.rootNode.setData(data);
        rootNodeSet = true;
    }

    public BinaryTreeNode getRootNode() {
        return this.rootNode;
    }

    public BinaryTreeNode insertNode(BinaryTreeNode node, int data) {

        if(node == null && !rootNodeSet) {
            rootNodeSet = true;
            return new BinaryTreeNode(null, null, data);
        }

        if(node == null && rootNodeSet) {
            return new BinaryTreeNode(null, null, data);
        }

        if(data < node.data) {
            node.leftNode = insertNode(node.leftNode, data);
        }

        if(data > node.data) {
            node.rightNode = insertNode(node.rightNode, data);
        }

        return node;

    }

    public int searchTree(BinaryTreeNode node, int data) {
        if(node == null) return 0;

        if(data == node.data) return data;

        if(data < node.getData()) {
            data = searchTree(node.leftNode,  data);
        }

        if(data > node.getData()) {
            data = searchTree(node.getRightNode(), data);
        }

        return data;
    }

    public void deleteNode(BinaryTreeNode node, int data) {

    }


    /**
     * Reference from     http://webdocs.cs.ualberta.ca/~holte/T26/top-slides-104.html
     * int size (binary_tree *t)
            { return is_empty(t) ? 0 : 1 + size(t->left) + size(t->right); }

     * @param node
     * @return
     */
    public int getSize(BinaryTreeNode node) {
        if(node == null) return 0;
        return 1 + getSize(node.getLeftNode()) + getSize(node.getRightNode());
    }

    /**
     * Reference from  http://leetcode.com/2010/04/maximum-height-of-binary-tree.html
     * int maxHeight(BinaryTree *p) {
            if (!p) return 0;
            int left_height = maxHeight(p->left);
            int right_height = maxHeight(p->right);
            return (left_height > right_height) ? left_height + 1 : right_height + 1;
      }
     *
     * @param node
     * @return
     */
    public int getMaximumHeight(BinaryTreeNode node) {
        if(node == null) return 0;
        int rightSide = getMaximumHeight(node.getRightNode());
        int leftSide =  getMaximumHeight(node.getLeftNode());
        return (leftSide > rightSide) ? 1 + leftSide : 1 + rightSide;
    }

    /**
     * Types of traversals
     *
     *
     * PreOrder traversal - visit the parent first and then left and right children;
     * InOrder traversal - visit the left child, then the parent and the right child;
     * PostOrder traversal - visit left child, then the right child and then the parent;
     */

    /**
     *
     * @param node
     */
    public void preOrderTraversal(BinaryTreeNode node) {
        System.out.println(node.getData()+" ");
        preOrderTraversal(node.getLeftNode());
        preOrderTraversal(node.getLeftNode());
    }

    /**
     *
     * @param node
     */
    public void inOrderTraversal(BinaryTreeNode node) {
        inOrderTraversal(node.getLeftNode());
        System.out.println(node.getData()+" ");
        inOrderTraversal(node.getRightNode());
    }

    public void postOrderTraversal(BinaryTreeNode node) {
        postOrderTraversal(node.getLeftNode());
        postOrderTraversal(node.getRightNode());
        System.out.println(node.getData()+" ");
    }

    public ArrayList<ArrayList<Integer>> levelOrderTraversal(BinaryTreeNode root) {
        ArrayList<ArrayList<Integer>> levels = new ArrayList<ArrayList<Integer>>();
        if(root == null) return levels;
        int curr = 1;
        int next = 0;
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        ArrayList<Integer> level = new ArrayList<Integer>();
        q.add(root);
        while(!q.isEmpty()){
            curr--;
            BinaryTreeNode n = q.poll();
            level.add(n.getData());

            if(n.getLeftNode() != null) {
                q.add(n.getLeftNode());
                next++;
            }

            if(n.getRightNode() != null) {
                q.add(n.getRightNode());
                next++;
            }

            if(curr == 0){
                levels.add(level);
                level = new ArrayList<Integer>();
                curr = next;
                next = 0;
            }
        }
        //return levels;
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for(int i = levels.size()-1;i>=0;i--) {
            result.add(levels.get(i));
        }
        return result;
    }

    public ArrayList<ArrayList<Integer>> levelOrderTraversal_one(BinaryTreeNode root) {
        ArrayList<ArrayList<Integer>> levels = new ArrayList<ArrayList<Integer>>();
        if(root == null) return levels;
        int curr = 1;
        int next = 0;
        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        ArrayList<Integer> level = new ArrayList<Integer>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryTreeNode node = queue.poll();
            level.add(node.data);
            curr--;

            if(node.leftNode != null) {
                queue.add(node.leftNode);
                next++;
            }

            if(node.rightNode != null) {
                queue.add(node.rightNode);
                next++;
            }

            if(curr == 0) {
                curr = next;
                next = 0;
                levels.add(level);
                level = new ArrayList<Integer>();
            }

        }
        return levels;

    }

    public void build123() {
        rootNode = new BinaryTreeNode(null, null, 2);
        BinaryTreeNode leftNode = new BinaryTreeNode(null, null, 1);
        BinaryTreeNode rightNode = new BinaryTreeNode(null, null, 3);
        rootNode.leftNode = leftNode;
        rootNode.rightNode = rightNode;
    }

    public int getSizeOfTree(BinaryTreeNode node) {
        if(node == null) return 0;
        return 1 + getSizeOfTree(node.getLeftNode()) + getSizeOfTree(node.getRightNode());
    }

    public int getMaxDepthOfTree(BinaryTreeNode node) {
        if(node == null) return 0;
        int leftHeight = getMaxDepthOfTree(node.getLeftNode());
        int rightHeight = getMaxDepthOfTree(node.getRightNode());
        return (rightHeight > leftHeight) ? 1 + rightHeight : 1 + leftHeight;
    }

    private int getMinimumValueInTree(BinaryTreeNode node) {
        if(node == null) return 0;
        BinaryTreeNode currentNode = node;
        while(currentNode != null) {
            currentNode = currentNode.getLeftNode();
        }
        return currentNode.getData();
    }



}
