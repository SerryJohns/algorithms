package com.serionz.searching;

public class LinearSearch {
    public static boolean search(int[] list, int searchTerm) {
        for (int item : list) {
            if (item == searchTerm)
                return true;
        }
        return false;
    }
}
