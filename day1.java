/*
    Day 1:
    reading input and printing output in the console.
*/ 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class day1 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner s = new Scanner(System.in);

        //using bufferedreader
        
        //printing someting to the console
        System.out.print("Enter a number: ");
        //store a value given by the user in a variable
        int a = Integer.parseInt(br.readLine());
        System.out.print("Enter another number: ");
        int b = Integer.parseInt(br.readLine());

        int c = a + b;
        System.out.print("result: " + c); 

        System.out.print("\nEnter a name: ");
        String name = br.readLine();

        System.out.print("Enter a double value: ");
        double d = Double.parseDouble(br.readLine());

        System.out.println("Name: " + name + "\nDouble: " + d);

        //using scanner
        System.out.print("Enter a name: ");
        String n = s.nextLine();

        System.out.print("Enter a number: ");
        int x = s.nextInt();
        System.out.print("Enter another number: ");
        int y = s.nextInt();
        System.out.print("result: " + (x + y));

        

        System.out.print("\nEnter a double value: ");
        double d2 = s.nextDouble();

        System.out.print("\nName: " + n + "\nDouble: " + d2);
    }
}