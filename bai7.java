import java.util.*;

public class bai7 {
    static void printDivisors(int n)
        {
            for (int i=1;i<=n;i++)
                if (n%i==0)
                    System.out.print(i+" ");
        }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhao so can tinh");
        int num = input.nextInt();
        System.out.println("Uoc so la");
        printDivisors(num);
    }
}