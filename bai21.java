import java.util.*;

public class bai21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("DK nhap 0 <= x1 < x2 < 10000; 1 <= v1, v2 <= 10000");
        System.out.println("Nhap vi tri x1 cua con Kangaroo dau tien");
        float x1 = input.nextInt();
        System.out.println("Nhap toc do v1 ");
        float v1 = input.nextInt();
        System.out.println("Nhap vi tri x2 cua con Kangaroo thu hai ");
        float x2 = input.nextInt();
        System.out.println("Nhap toc do v2 ");
        float v2 = input.nextInt();
        float position_meet = (x1 - x2)/(v2 - v1);
        int num_step_near = (int) position_meet;
        int num_step_meet = num_step_near;
        if (num_step_near < position_meet) num_step_meet = num_step_near + 1;
        if ((x1 < x2 && v1 < v2) || (x1 > x2 && v1 > v2)) System.out.println("2 con kangaroo khong the gap nhau ");
        else System.out.println("2 con kangaroo se gap nhau tai lan nhay thu " + num_step_meet);
    }
}