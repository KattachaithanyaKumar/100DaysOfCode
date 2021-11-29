import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day2 {
    public static void main(String args[]) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];

        System.out.println("Enter 10 elements: ");
        for (int i = 0; i < 10; i++)  {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("the elements are: ");
        for (int i = 0; i < 10; i++)  {
            System.out.println(i + ": " + arr[i]);
        }
    }
}
