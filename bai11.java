import java.util.*;
import java.io.*;
import java.lang.*;

public class bai11 {
    public static int log2(int N)
    {
        double num_log = Math.log(N) / Math.log(2);
        System.out.println(num_log);
        int result = (int)(Math.log(N) / Math.log(2));
        if (result == num_log) return result-1;
        return result;
    }

    // Driver code
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so can tinh");
        int N = input.nextInt();

        System.out.println("So lon nhat va nho hon cua log2(" + N + ") la " + log2(N));
    }
}
