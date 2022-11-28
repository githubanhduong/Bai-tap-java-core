import java.util.*;

public class bai12 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Nhap so");
       int num_line = input.nextInt();
        System.out.println("Hien thi pattern");
        for (int i=1; i <= num_line; i++){
           for (int j=1; j <= i; j++) {
               System.out.print(j);
           }
           System.out.println("");
       }
    }
}