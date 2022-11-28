import java.util.*;

public class bai19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Moi ban chon\n"
                           + "1.Giai pt bac 1\n"
                           + "2.Giai pt bac 2");
        int num_chose;
        do {
            num_chose = input.nextInt();
            if (num_chose < 0 || num_chose >2) System.out.println("Ban chon lai");
        } while (num_chose < 0 || num_chose > 2);
        switch (num_chose){
            case 1:
                System.out.println("Giai pt ax + b = 0 ");
                System.out.println("Moi ban nhap a ");
                int a = input.nextInt();
                System.out.println("Moi ban nhap b");
                int b = input.nextInt();
                if (a == 0 && b == 0) System.out.println("PT vo so nghiem");
                else if (a == 0 && b != 0) System.out.println("PT vo nghiem");
                else System.out.println("PT " + a +"x + " + b + " = 0 co nghiem x=" + (float)-b/a);
                break;
            case 2:
                float x = 0;
                float x1 =0;
                System.out.println("Giai pt ax^2 + bx + c = 0 ");
                System.out.println("Moi ban nhap a ");
                a = input.nextInt();
                System.out.println("Moi ban nhap b");
                b = input.nextInt();
                System.out.println("Moi ban nhap c");
                int c = input.nextInt();
                if (a == 0 && b == 0 && c == 0) {System.out.println("PT vo so nghiem"); break;}
                else if (a == 0 && b == 0 && c != 0) {System.out.println("PT vo nghiem"); break;}
                else {
                    if (a == 0 && b != 0) x = (float) -b/a;
                    else{
                        float d = (b*b)-(4*a*c);
                        float r = -b/(2*a);
                        if (d == 0) {x = r; System.out.println("PT " + a +"x^2 + " + b + "x + "+ c + " = 0 co nghiem x= " + x); break;}
                        else if (d < 0) System.out.println("PT vo nghiem");
                        else {x = r + (((float) Math.sqrt(d)) / (2*a)) ; x1 = r - (((float) Math.sqrt(d)) / (2*a));}
                    }
                }
                System.out.println("PT " + a +"x^2 + " + b + "x + "+ c + " = 0 co nghiem x1= " + x + " va x2= " + x1);
        }

    }
}