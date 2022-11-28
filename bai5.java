import java.util.*;

public class bai5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Toa do x(A) = ");
        float xA = input.nextFloat();
        System.out.println("Toa do y(A) = ");
        float yA = input.nextFloat();
        System.out.println("Toa do x(B) = ");
        float xB = input.nextFloat();
        System.out.println("Toa do y(B) = ");
        float yB = input.nextFloat();

        float distance_AB = ((xB-xA)*(xB-xA))+((yB-yA)*(yB-yA));

        System.out.println("Do dai AB = " + Math.sqrt(distance_AB));
    }
}