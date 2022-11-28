import java.util.*;
import java.text.*;

public class bai17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Nhap so ban doan ");
        int num_predicted = input.nextInt();
        double num_ran = Math.random();
        num_ran = Double.valueOf(df.format(num_ran)) * 100;
        int result = (int) num_ran;
        System.out.println(result);
        if (num_predicted < result) {
            System.out.println("So ban doan nho hon ");
        } else if (num_predicted > result){
            System.out.println("So ban doan lon hon ");
        } else System.out.println("Ban da doan dung");
    }
}