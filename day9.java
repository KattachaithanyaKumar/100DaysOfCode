/*
    Day 9
    Strings 
*/

import java.io.*;

public class day9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //declaring a string
        String str = "Hello";
        System.out.println(str);

        //getting the string from the user 
        System.out.print("Enter a name of an animal: ");
        String name = br.readLine();

        System.out.print("What does " + name + " like to eat: ");
        String food = br.readLine();

        System.out.println("Your favirate animal is " + name + " and it like to eat " + food);

        //concatinating strings
        String str1 = "hello";
        String str2 = "World";

        String con = str1.concat(str2);
        System.out.println("The string is : " + con);

        //length of the string
        String sentence = "Hello world, My name is chaithanya";
        System.out.println("The length of the string is " + sentence.length());

        //replace string
        System.out.println("The sentence is: " + sentence);
        System.out.println("The sentence after replacing a with p: " + sentence.replace("a", "p"));

        //convert the string to lower case 
        System.out.println("The sentence is: " + sentence);
        System.out.println("The sentence after lower case: " + sentence.toLowerCase());

        //convert the string to upper case 
        System.out.println("The sentence is: " + sentence);
        System.out.println("The sentence after upper case: " + sentence.toUpperCase());

        //trim the white spaces from the string
        sentence = "    hello world     ";
        System.out.println("The sentence is: " + sentence);
        System.out.println("The sentence after trim: " + sentence.trim());
    }
}
