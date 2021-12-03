/*
    Day 7:
    Biggest number in the array
*/

import java.io.*;

public class day7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the array: ");
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++)  {
            System.out.print(i + ": ");
            arr[i] = Integer.parseInt(br.readLine());
        }

        int largest = 0;
        for (int i = 0; i < arr.length; i++)  {
            if (arr[i] > largest)  {
                largest = arr[i];
            }
        }

        System.out.println("the largest element is: " + largest);
    }
}
