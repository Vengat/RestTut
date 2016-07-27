package com.vengat.tuts.myhashmap;

/**
 * Created by IntelliJ IDEA.
 * User: vramanan
 * Date: 7/28/13
 * Time: 5:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyKeyVal<K,V> {

    private final K key;
    private V value;

    public MyKeyVal(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return this.key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public V getValue() {
        return this.value;
    }
}
