package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int randomArray[] = new int[100];
        System.out.println(Arrays.toString(randomArray));
        randomArray = fillArrayWithRandomValues(randomArray);
        System.out.println(Arrays.toString(randomArray));
        System.out.println(binarySearch(randomArray, 3));

    }

    public static int binarySearch(int[] inputArray, int numberForSearch ) {
        int length = inputArray.length - 1;
        int low = 0;
        int high = inputArray[length];
        int mid = (low + high) / 2;

        while (low <= high) {
            if (inputArray[mid] == numberForSearch) {
                return mid;
            } else if (inputArray[mid] > numberForSearch) {
                high = mid - 1;
                mid = (low + high) / 2;
            } else {
                low = mid + 1;
                mid = (low + high) / 2;
            }
        }

        return 0;

    }

    public static int[] fillArrayWithRandomValues(int[] inputArray) {
        int arrayLength = inputArray.length;
        int[] tempArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            tempArray[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(tempArray);

        return tempArray;
    }
}
