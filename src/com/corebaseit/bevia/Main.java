package com.corebaseit.bevia;

import java.util.Arrays;

class BinarySearchOuterClass {

    void outerMethod(int value) {

        InnerClass ic = new InnerClass();
        ic.binarySearchExercise(value);
    }

    class InnerClass {

        int lowIndex = 0;
        int highIndex = 0;
        int index = 0;

        public int binarySearchExercise(int value) {

            int[] myInts = {11, 15, 56, 76, 87, 97, 45, 62, 8, 62, 48, 33};
            //from this array use binary search to fin the index where number 45 resides!

            //Find Length of Array:
            highIndex = myInts.length;

            //YOU MUST SORT THE ARRAY for Binary Search to be EFFICIENT!!
            Arrays.sort(myInts);

            for(int i=0; i<=highIndex -1; i++)
            {
                System.out.println(myInts[i] + " at index: " + i);
            }

            //Searching Algorithm....
            while (lowIndex <= highIndex) {

                int middleIndex = (highIndex + lowIndex) / 2;

                if (myInts[middleIndex] < value) {
                    lowIndex = middleIndex + 1;
                } else if (myInts[middleIndex] > value) {
                    highIndex = middleIndex - 1;
                } else {
                    System.out.println("\nThe value " + value + " was found at index: " + middleIndex);
                    lowIndex = highIndex + 1;
                }

            }

            return 0;
        }
    }
}

// My Main Class....
public class Main {

    public static void main(String[] args) {

        BinarySearchOuterClass m = new BinarySearchOuterClass();
        m.outerMethod(76);  // value to be found...

    }
}
