/*
Linear search:
    Searching through the array in a linear manner.
*/ 

import java.io.*;

public class day3 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the size of the array: ");
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n ; i++)  {
            System.out.print(i + ": ");
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter the value to be found: ");
        int target = Integer.parseInt(br.readLine());
        int targetIndex = -1;

        for (int i = 0; i < n; i++)  {
            if (arr[i] == target)  {
                targetIndex = i;
                break;
            }
        }

        System.out.println("The element " + target + " is found at index " + targetIndex);

    }
}
