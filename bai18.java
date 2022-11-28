import java.util.*;
import java.io.*;
import java.lang.*;

public  class bai18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so tien gui theo don vi trieu ");
        int num_money = input.nextInt();
        System.out.println("Nhap lai suat ngan hang theo nam ");
        float InterestRate = input.nextFloat() / 100;
        System.out.println("Gia tien cua oto theo don vi trieu");
        int car_cost = input.nextInt();
        System.out.println("So nam gui tiet kiem de co the mua oto la ");
        float num_year_ToBuy = (float) (Math.log((car_cost / num_money)) / Math.log(1 + InterestRate));
        int count_year_BuyCar = (int) num_year_ToBuy;
        if (count_year_BuyCar < num_year_ToBuy) System.out.println(count_year_BuyCar + 1);
        else System.out.println(count_year_BuyCar);
    }
}