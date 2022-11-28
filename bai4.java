import java.io.*;
import java.util.*;

public class bai4 {

    /* Function to get sum of digits */
    static int getSum(int n)
    {
        int sum = 0;

        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        return sum;
    }

    // Driver code
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so de tinh");
        int n = input.nextInt();

        // Function call
        System.out.println("Ket qua\n" + getSum(n));
    }
}