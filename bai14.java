import java.util.*;

public class bai14
{
    static void array_not_duplicate (ArrayList<Float> array)
    {
        ArrayList<Float> arrayNew = new ArrayList<Float>();
        for(float i: array)
        {
            boolean a = true;
            for(float j: arrayNew) {
                if (i == j)
                {
                    a = false;
                }
            }
            if (a == true) arrayNew.add(i);
        }

        System.out.println("Mang sau khi duoc loc");
        for (float i : arrayNew)
        {
            System.out.println(i);
        }
    }

    public static void main (String[] args)
    {
        ArrayList<Float> array = new ArrayList<Float>();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so phan tu mang");
        int num_element = input.nextInt();
        System.out.println("Nhap cac phan tu mang theo dong");
        float value = 0;
        for (int i = 0; i < num_element; i++)
        {
            value = input.nextFloat();
            array.add(value);
        }
        array_not_duplicate(array);
    }
}

