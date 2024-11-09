package com.xyz;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNumber {
    /**
     * Find Duplicate
     * You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2).
     * Each number is present at least once. That is, if N = 5,
     * the array/list constitutes values ranging from 0 to 3 and among these,
     * there is a single integer value that is present twice.
     * You need to find and return that duplicate number present in the array.
     * @param args
     */
    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 0, 1, 2, 3, 3 };
        int result = arr[0];
        for(int i=1;i<n;i++) {
           result ^=arr[i];
        }
        System.out.println(result);
    }
}
