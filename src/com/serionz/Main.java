package com.serionz;

import com.serionz.searching.BinarySearch;
import com.serionz.searching.LinearSearch;

public class Main {

    public static void main(String[] args) {
        /*
         * Test binary Search implementation
         * NB: Binary requires a sorted array
         */
        int[] list = {1, 2, 5, 7, 8, 9, 12, 14};
        boolean status = BinarySearch.search(list, 9);
        System.out.println("Search Result: " + status);

        /*
         * Test linear search implementation
         * */
        int[] list2 = {1, 2, 5, 7, 8, 9, 12, 14};
        boolean status2 = LinearSearch.search(list2, 9);
        System.out.println("Search Result: " + status2);
    }
}
