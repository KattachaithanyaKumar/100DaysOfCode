/*
    selection sort
*/

import java.io.*;

public class day4 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the size of the array: ");
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++)  {
            System.out.print(i + ": ");
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < arr.length - 1; i++)  {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)  {
                if (arr[j] < arr[index])  {
                    index = j;
                }
            }
            int small = arr[index];
            arr[index] = arr[i];
            arr[i] = small;
        }

        System.out.println("Sorted array: ");
        for (int i = 0; i < arr.length; i++)  {
            System.out.println(arr[i]);
        }
    }
}
