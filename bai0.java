import java.util.Scanner;

public class bai0 {

  public static void main(String[] args) {
    int start_hour, end_hour;
    int bottles_number;
      Scanner input = new Scanner(System.in);
    do {
      System.out.println("Gio bat dau hat");
      start_hour = input.nextInt();
      System.out.println("Gio ket thuc hat");
      end_hour = input.nextInt();
    } while (start_hour < 9 || end_hour > 24);
      System.out.println("So chai nuoc khach dung");
      bottles_number = input.nextInt();
      int money_bottle = 10000;
      int money_water = bottles_number * money_bottle;
      int money_pay;
      int money_sing_hour = 30000;
      int customerSing_hour = end_hour - start_hour;

      if (start_hour >= 17 && end_hour<=24 ){
        if (customerSing_hour > 3) {
          money_pay = ((customerSing_hour - 3) * money_sing_hour * 70/100) + (3 * money_sing_hour) + money_water;
        } else { money_pay = customerSing_hour * money_sing_hour + money_water; }
        System.out.println("So tien khach tra " + money_pay);
      }

      if (start_hour < 17 && end_hour<=24 ){
        if (customerSing_hour > 3) {
          money_pay = ((customerSing_hour - 3) * money_sing_hour * 70/100) + (3 * money_sing_hour) + money_water;
        } else { money_pay = customerSing_hour * money_sing_hour + money_water; }
        System.out.println("So tien khach tra " + money_pay * 80/100);
      }

  }
}