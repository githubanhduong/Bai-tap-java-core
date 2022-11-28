
import java.util.Scanner;

public class bai16 {

    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap nam ");
        year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {

                    System.out.println("Nam " + year + " la nam nhuan");
                } else {
                    System.out.println("Nam " + year + " khong phai la nam nhuan");
                }
            } else {
                System.out.println("Nam " + year + " la nam nhuan");
            }
        } else {
            System.out.println("Nam " + year + " khong phai nam nhuan");
        }
    }

}