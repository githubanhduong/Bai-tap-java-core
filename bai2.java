import java.util.Scanner;
public class bai2 {
    static void Convert_decimal_to_binary(int number){
        int[] bin_num = new int[10];
        int i = 0;
        int j = 0;
        while(number != 0)
        {
            j++;
            bin_num[++i] = number%2;
            number = number/2;
        };

        System.out.print("   Binary number is: ");
        for(i=j ; i > 0 ; i--)
        {
            System.out.print(bin_num[i]);
        }
        System.out.print("\n");

    }

    static void Convert_binary_to_decimal(int number){

        long decimalNumber = 0, j = 1, remainder;

        while (number != 0)
        {
            remainder = number % 10;
            decimalNumber = decimalNumber + remainder * j;
            j = j * 2;
            number = number / 10;
        }
        System.out.println("Decimal Number: " + decimalNumber);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ban chon 1 hoac 2\n" + "1.Chuyen doi so thap phan\n" + "2.Chuyen doi so nhi phan");

        int number_chose = input.nextInt();

        switch (number_chose){
            case 1:
                System.out.println("Chuyen doi so thap phan thanh nhi phan");
                System.out.println("Nhap so thap phan \n");
                int number_Decimal = input.nextInt();
                Convert_decimal_to_binary(number_Decimal);
                break;

            case 2:
                System.out.println("Chuyen doi so thap phan thanh nhi phan");
                System.out.print("Nhap so nhi phan \n");
                int number_Binary = input.nextInt();
                Convert_binary_to_decimal(number_Binary);
                break;
        };


    }
}