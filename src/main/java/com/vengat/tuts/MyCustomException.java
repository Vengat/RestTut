package com.vengat.tuts;

/**
 * Created by IntelliJ IDEA.
 * User: vramanan
 * Date: 7/2/13
 * Time: 8:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyCustomException extends Exception {

    public MyCustomException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        int[] arrayT = new  int[12];
        int i=0;
        System.out.println(++i % arrayT.length);
        System.out.println(++i % arrayT.length);
        System.out.println(++i % arrayT.length);
        System.out.println(++i % arrayT.length);
        System.out.println(++i % arrayT.length);
        System.out.println(arrayT.length);
    }
}
