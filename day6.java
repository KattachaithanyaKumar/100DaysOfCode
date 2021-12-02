/*
    2 Dimentional arrays
*/

import java.io.*;

public class day6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the rows: ");
        int r = Integer.parseInt(br.readLine());
        System.out.println("\nEnter the cols: ");
        int c = Integer.parseInt(br.readLine());

        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++)  {
            for (int j = 0; j < c; j++)  {
                System.out.print("\n" + i + "-" + j + ": ");
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }

        System.out.println("the elements in the array are: \n");
        for (int i = 0; i < r; i++)  {
            for (int j = 0; j < c; j++)  {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
