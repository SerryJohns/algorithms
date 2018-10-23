package com.serionz;

import com.serionz.searching.BinarySearch;
import com.serionz.searching.LinearSearch;
import com.serionz.sorting.HeapSort;
import com.serionz.sorting.QuickSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        long startTime;
        long endTime;
        /*
         * Run binary Search implementation
         * NB: Binary requires a sorted array
         */
        int[] list = {1, 2, 5, 7, 8, 9, 12, 14};
        startTime = System.nanoTime();
        boolean status = BinarySearch.search(list, 9);
        endTime = System.nanoTime();

        System.out.println("================================================================");
        System.out.println("Binary Search: Searching for 9 in {1, 2, 5, 7, 8, 9, 12, 14}");
        System.out.println("Search Result: " + status);
        printExecutionTime(startTime, endTime);

        /*
         * Run linear search implementation
         * */
        startTime = System.nanoTime();
        boolean status2 = LinearSearch.search(list, 9);
        endTime = System.nanoTime();

        System.out.println("================================================================");
        System.out.println("Linear Search: Searching for 9 in {1, 2, 5, 7, 8, 9, 12, 14}");
        System.out.println("Search Result: " + status2);
        printExecutionTime(startTime, endTime);

        /*
         * Run quick sort implementation
         * */
        int[] list2 = {1, 8, 2, 5, 3, 9, 7, 4};
        startTime = System.nanoTime();
        QuickSort.quickSort(list2, 0, list2.length - 1);
        endTime = System.nanoTime();

        System.out.println("================================================================");
        System.out.println("Quick Sorting List: {1, 8, 2, 5, 3, 9, 7, 4}");
        System.out.println(Arrays.toString(list2));
        printExecutionTime(startTime, endTime);

        /*
         * Heap Sort*/
        int[] list3 = {1, 7, 8, 4, 10, 16, 19, 3, 5};
        startTime = System.nanoTime();
        HeapSort.sort(list3);
        endTime = System.nanoTime();

        System.out.println("================================================================");
        System.out.println("Heap Sorting List: {1, 7, 8, 4, 10, 16, 19, 3, 5}");
        System.out.println(Arrays.toString(list3));
        printExecutionTime(startTime, endTime);
    }

    private static void printExecutionTime(long startTime, long endTime) {
        System.out.println("Execution time: "
                + ((endTime - startTime) / 1000)
                + " microseconds");
    }
}
