import java.util.*;

public class bai15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String input_str = input.next();
        int len = input_str.length();
        System.out.println("Do dai chuoi la " + len);
        int id_str_watch;
        do {
            System.out.println("Nhap index chuoi de in ra ki tu ");
            id_str_watch = input.nextInt();
        } while (id_str_watch >= len);
        System.out.println("Ki tu do la " + input_str.charAt(id_str_watch));
        String txt = "abcdef";
        boolean result = input_str.contains(txt);
        if(result) {
            System.out.println(txt + " la chuoi phu");
        }
        else {
            System.out.println(txt + " khong phai la chuoi phu");
        }
    }
}