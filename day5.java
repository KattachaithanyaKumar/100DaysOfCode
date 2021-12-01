/*
    Day 4:
    Bubble sort:
*/

import java.io.*;

public class day5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter the size of the array: ");
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        System.out.println("enter the elements of the array: ");
        for (int i = 0; i < n; i++)  {
            System.out.print(i + ": ");
            arr[i] = Integer.parseInt(br.readLine());
        }

        //bubble sort
        for (int i = 0; i < arr.length - 1; i++)  {
            for (int j = 0; j < arr.length - i - 1; j++)  {
                if (arr[j] > arr[j+1])  {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("The array after bubble sort is: ");
        for (int i = 0; i < arr.length; i++)  {
            System.out.println(i + ": " + arr[i]);
        }
    }
}
