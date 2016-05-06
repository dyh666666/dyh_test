package com.dyh.test;

public class BubbleSort {
    public static void main(String[] args) {
        int temp = 0;
        int[] arr = { 2, 3, 5, 7, 8, 1, 4, 6 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
