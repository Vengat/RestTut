package com.vengat.tuts;

/**
 * Created by IntelliJ IDEA.
 * User: vramanan
 * Date: 7/2/13
 * Time: 10:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class ChildNode {

    protected Object data;
    protected ChildNode nextNode;

    public ChildNode() {
        this.data = null;
        this.nextNode = null;
    }

    public ChildNode(Object data, ChildNode nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public void setNext(ChildNode nextNode) {
        this.nextNode = nextNode;
    }



}
