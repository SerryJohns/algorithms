package com.serionz.sorting;

public class HeapSort {
    public static void sort(int[] list) {
        buildHeap(list);
        int size = list.length - 1;

        for (int i = size; i > 0; i--) {
            exchange(list, 0, i);
            size -= 1;
            heapify(list, 0, size);
        }
    }

    public static void buildHeap(int[] list) {
        /*
         * We start heapifying from the middle element since it is the last non leaf node
         * */
        for (int i = (list.length - 1) / 2; i >= 0; i--) {
            heapify(list, i, list.length - 1);
        }
    }

    private static void heapify(int[] list, int index, int size) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int max;

        if (left <= size && list[left] > list[index]) {
            max = left;
        } else {
            max = index;
        }

        if (right <= size && list[right] > list[max]) {
            max = right;
        }

        // If max is not current node, exchange it with the max of left and right child
        if (max != index) {
            exchange(list, index, max);
            heapify(list, max, size);
        }
    }

    private static void exchange(int[] list, int index, int max) {
        int temp = list[index];
        list[index] = list[max];
        list[max] = temp;
    }
}
