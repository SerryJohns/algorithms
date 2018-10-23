package com.serionz.searching;

public class BinarySearch {
    public static boolean search(int[] list, int searchTerm) {
        /*
        * the method takes an integer array and returns true if and item has been found or false otherwise
        * */

        if (list.length == 0) {
            return false;
        }

        int lowerIndex = 0;
        int upperIndex = list.length - 1;

        while (lowerIndex <= upperIndex) {
            int middleIndex = (lowerIndex + upperIndex) / 2;

            if (searchTerm > list[middleIndex]) {
                lowerIndex = middleIndex + 1;
            } else if (searchTerm < list[middleIndex]) {
                upperIndex = middleIndex - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
