import java.util.*;

public class bai20 {
    static void all_even_old_number(ArrayList<String> array_num){
        ArrayList<Float> new_array = new ArrayList<Float>();
        for (int i=0; i<array_num.size(); i++){
            float num = Float.parseFloat(array_num.get(i));
            new_array.add(num);
        }

        System.out.println("Cac so chan la");
        for (float i : new_array) {
            if(i%2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Cac so le la");
        for (float i : new_array) {
            if(i%2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap cac phan tu mang");
        String empty = "";
        String element;

            while (true) {
                element = (String) input.nextLine();
                if (element == empty) break;
                array.add(element);
            }
        all_even_old_number(array);
    }
}