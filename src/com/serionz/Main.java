package com.serionz;

import com.serionz.searching.BinarySearch;
import com.serionz.searching.LinearSearch;
import com.serionz.sorting.QuickSort;

public class Main {

    public static void main(String[] args) {
        /*
         * Run binary Search implementation
         * NB: Binary requires a sorted array
         */
        int[] list = {1, 2, 5, 7, 8, 9, 12, 14};
        boolean status = BinarySearch.search(list, 9);
        System.out.println("Search Result: " + status);

        /*
         * Run linear search implementation
         * */
        int[] list2 = {1, 2, 5, 7, 8, 9, 12, 14};
        boolean status2 = LinearSearch.search(list2, 9);
        System.out.println("Search Result: " + status2);

        /*
         * Run quick sort implementation
         * */
        int[] list3 = {1, 8, 2, 5, 3, 9, 7, 4};
        QuickSort.quickSort(list3, 0, list3.length - 1);
        System.out.println("Sorted List: ");
        for (int i : list3) {
            System.out.print(i);
        }
    }
}
