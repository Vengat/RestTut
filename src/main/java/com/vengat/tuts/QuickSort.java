package com.vengat.tuts;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: vramanan
 * Date: 6/29/13
 * Time: 4:59 PM
 * To change this template use File | Settings | File Templates.
 *
 *
 */
public class QuickSort {


    //int[] intArray = {8,1,4,9,5,3,6,7,2};
    private  int[] intArray;
    private int lengthOfArray;
    private int pivot;
    public void quickSortFeeder(int[] intArray) {
        this.intArray = intArray;
        this.lengthOfArray = intArray.length;
        if(this.intArray == null || this.lengthOfArray <= 1) return;
        sort(0,this.lengthOfArray-1);
    }

    public void sort(int left, int right) {
        int i = left;
        int j = right;

        Random random = new Random();
        int randomInt = random.nextInt(lengthOfArray);
        pivot = randomInt;

        while(i<=j){
            /**
             * if intArray[i] < pivot value, we can keep incrementing 'i'
             * if intArray[i] > pivot value, we need to step out of the block
             */

            while(intArray[i] < pivot) {
                i++;
            }

            /**
             * if intArray[j] > pivot value, we can keep decrementing 'j'
             * if intArray[j] < pivot value, we need to step out of the block
             */

            while(intArray[j] > pivot) {
                j--;
            }

            /**
             * Suppose if intArray[i] > pivot value {1, 3 , 5, 4, 6, 7} - pivot value is 4
             *                                                 _
             * intArray[2] will be greater than the pivot value 4 and the while loop would have exited before incrementing i
             * so value of i would be 1
             * value of j would be 4
             * in this case we can exchange intArray[i] and intArray[j]
             * so the result would be {1, 6, 5, 4, 3, 7}
             * do i++ and j--
             * now value of i = 2 and j = 3
             *
             */

        }
        /**
         * Now make sub arrays
         * {5, 4, 3, 7}
         * {1, 6, 4, 3}
         *
         * ---Next step
         *
         * {7,4,3,5}
         *
         * {4, 3, 5}
         * {7, 4, 3}
         *
         * ---Next step
         * {
         */

    }


}
