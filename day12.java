/*
    Day 12:
    Duplicate values in the array
*/

import java.io.*;

public class day12 {
    public static int missingNumber(int[] arr)
    {
        int n = arr.length + 1;
        int sum = n*(n + 1)/2;
        int restSum = 0;
        for (int i = 0; i < arr.length; i++) {
            restSum += arr[i];
        }
        int missingNumber = sum - restSum;
        return missingNumber;
    }
    public static void main(String args[]) throws IOException {
        int[] arr1 = {1,2,3,4,6,7};
        System.out.println("Missing number from array arr1: " + missingNumber(arr1));
        int[] arr2 = {1,3,4,5,6,7,8,9,10};
        System.out.println("Missing number from array arr2: " + missingNumber(arr2));
    }
}
