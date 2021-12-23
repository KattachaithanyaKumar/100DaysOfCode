/*
    day 18:
    Strong number:
    a string number is a number whose sum 
    of factorial of its digits equals to itself.
*/

import java.io.*;

public class day18 {
    public static int fact(int a)  {
        int f = 1;
        for (int i = 1; i <= a; i++)  {
            f = f  * i;
        }
        return f;
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the given number: ");
        int n = Integer.parseInt(br.readLine());

        String s = String.valueOf(n);
        int l = s.length();
        int[] arr = new int[l];
        int sum = 0;

        for (int i = 0; i < l; i++)  {
            arr[i] = s.charAt(i) - '0';
            sum += fact(arr[i]);
        }

        if (sum == n)  {
            System.out.println(n + " is a strong number");
        }else{
            System.out.println(n + " is not a strong number");
        }
        
    }
}