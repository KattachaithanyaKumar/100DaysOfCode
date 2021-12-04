/*
    Day 8:
    merging two arrays
*/

import java.io.*;

public class day8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s1, s2;

        System.out.print("Enter the size of the first array: ");
        s1 = Integer.parseInt(br.readLine());
        int[] arr1 = new int[s1];
        
        System.out.print("Enter the size of the second array: ");
        s2 = Integer.parseInt(br.readLine());
        int[] arr2 = new int[s2];

        System.out.println("Eneter the elements of the first array: ");
        for (int i = 0; i < s1; i++)  {
            System.out.print(i + ": ");
            arr1[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter the elements of the second arary: ");
        for (int i = 0; i < s2; i++)  {
            System.out.print(i + ": ");
            arr2[i] = Integer.parseInt(br.readLine());
        }

        int[]arr3 = new int[s1 + s2];

        for (int i = 0; i < arr1.length; i++)  {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++)  {
            arr3[s1 + i] = arr2[i];
        }

        System.out.println("The merged array is: ");
        for (int i = 0; i < arr3.length; i++)  {
            System.out.println(i + ": " + arr3[i]);
        }

    }
}
