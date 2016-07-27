package com.vengat.tuts;

/**
 * Created by IntelliJ IDEA.
 * User: vramanan
 * Date: 6/28/13
 * Time: 1:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class SortingClass {

    /**
     * We will try a few sorting algorithms in this class
     */

    public void bubbleSort() {
        int[] intArray = {8,1,4,9,5,3,6,7,2};

        for(int i=0;i<intArray.length;i++) {
            //System.out.println(intArray[i]);
            for(int j=0;j<intArray.length-1;j++) {
                //System.out.println(intArray[j]);
                if(intArray[j+1]<intArray[j]) {
                    int temp = intArray[j+1];
                    intArray[j+1] = intArray[j];
                    intArray[j] = temp;
                }
                System.out.print(intArray[j]);
            }
            System.out.println();
            System.out.print(intArray[i]);
            System.out.println();
        }
        for(int k=0;k<intArray.length;k++) {
            System.out.print(intArray[k]);
        }

    }

    /*ascending*/
    public void insertionSort() {
        int[] intArray = {8,1,4,9,5,3,6,7,2};
        for(int i=0;i<intArray.length-1;i++){
            int referenceCardPos = i;
            for(int j=i+1;j<intArray.length;j++){
                int newlyTakenCardPos = j;
                if(intArray[newlyTakenCardPos] < intArray[referenceCardPos]){
                    referenceCardPos = newlyTakenCardPos;
                }
            }
            int temp = intArray[i];
            intArray[i] = intArray[referenceCardPos];
            intArray[referenceCardPos] = temp;
            //System.out.print(intArray[i]);
            //System.out.println();
        }
        for(int k=0;k<intArray.length;k++) {
            System.out.print(intArray[k]);
        }
    }

    public static void main(String[] args) {
        SortingClass sortingClass = new SortingClass();
        //sortingClass.bubbleSort();
        sortingClass.insertionSort();
    }
}
