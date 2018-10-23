package com.serionz.sorting;

public class QuickSort {
    public static void quickSort(int[] list, int lowerIndex, int upperIndex) {
        if (lowerIndex < upperIndex) {
            int pivotIndex = partition(list, lowerIndex, upperIndex);
            quickSort(list, lowerIndex, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, upperIndex);
        }
    }

    private static int partition(int[] list, int lowerIndex, int upperIndex) {
        int pivot = list[upperIndex];
        int i = lowerIndex - 1;

        for (int j = lowerIndex; j < upperIndex; j++) {
            if (list[j] <= pivot) {
                i++;

                int swapTemp = list[i];
                list[i] = list[j];
                list[j] = swapTemp;
            }
        }

        int swapTemp = list[i + 1];
        list[i + 1] = list[upperIndex];
        list[upperIndex] = swapTemp;

        return i + 1;
    }
}
