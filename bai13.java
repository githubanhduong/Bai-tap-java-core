import java.util.*;

public class bai13 {
    static void average_function(ArrayList<Float> list){
        float sum = 0;
        for (float i : list)
        {
            sum+=i;
        }
        if(list.isEmpty())
        {
            System.out.println("List is empty!");
        }
        else
        {
            System.out.println( sum/(float)list.size());
        }
    }

    static void find_max_min_function(ArrayList<Float> myList){
        float maximum = myList.get(0);
        for (int i = 1; i < myList.size(); i++) {
            if (maximum < myList.get(i))
                maximum = myList.get(i);
        }
        float minimum = myList.get(0);
        for (int i = 1; i < myList.size(); i++) {
            if (minimum > myList.get(i))
                minimum = myList.get(i);
        }
        System.out.println(maximum + " va " + minimum);
    }

    static void find_positiveNumber_max_min_function(ArrayList<Float> myList){
        ArrayList<Float> id_finded = new ArrayList<Float>();
        for (float i : myList){
            if (i > 0)
                id_finded.add(i);
        }

        if (!id_finded.isEmpty()) {
            float maximum = id_finded.get(0);
            for (float i : id_finded) {
                if (maximum < i)
                    maximum = i;
            }

            float minimum = id_finded.get(0);
            for (float i : id_finded) {
                if (minimum > i)
                    minimum = i;
            }
            System.out.println(maximum + " va " + minimum);
        } else {System.out.println("Khong co so duong trong mang");}
    }

    static void find_negativeNumber_max_min_function(ArrayList<Float> myList){
        ArrayList<Float> id_finded = new ArrayList<Float>();
        for (float i : myList){
            if (i < 0)
                id_finded.add(i);
        }

        if (!id_finded.isEmpty()) {
            float maximum = id_finded.get(0);
            for (float i : id_finded) {
                if (maximum < i)
                    maximum = i;
            }

            float minimum = id_finded.get(0);
            for (float i : id_finded) {
                if (minimum > i)
                    minimum = i;
            }
            System.out.println(maximum + " va " + minimum);
        } else {System.out.println("Khong co so am trong mang");}
    }

    static void all_even_old_number(ArrayList<Float> a){
        System.out.println("Cac so chan la");
        for (float i : a) {
                if(i%2 == 0) {
                    System.out.println(i);
                }
        }
        System.out.println("Cac so le la");
        for (float i : a) {
            if(i%2 != 0) {
                System.out.println(i);
            }
        }
    }

    static void add_element_function(ArrayList<Float> a, int n, float value){
        a.add(n, value);
        System.out.println("Cac phan tu mang hien tai la");
        for(float i : a){
           System.out.println(i + " ");
        }
    }

    static void delete_element_function(ArrayList<Float> a, int n){
        if (!a.isEmpty()){
            a.remove(n);
            System.out.println("Cac phan tu mang hien tai la");
            if (!a.isEmpty()) {
                for (float i : a) {
                    System.out.println(i + " ");
                }
            } else System.out.println("Mang rong");
        } else System.out.println("Mang rong");

    }

    static void choice(int num_chose, ArrayList<Float> array_number){
        Scanner input = new Scanner(System.in);
        switch (num_chose) {
            case 0:
                break;
            case 1:
                System.out.println("Do dai mang hien tai la " + array_number.size() + " Ban nhap index nho hon " + array_number.size());
                System.out.println("Nhap index");
                int index = input.nextInt();
                System.out.println("Nhap gia tri");
                float value = input.nextInt();
                add_element_function(array_number, index, value);
                System.out.println("Ban muon xoa pt theo index ko:\n Nhap 1 (Co) hoac 0 (Khong) ");
                num_chose = input.nextInt();
                if (num_chose == 0) break;
            case 2:
                System.out.println("Do dai mang hien tai la " + array_number.size() + " Ban nhap index nho hon " + array_number.size());
                System.out.println("Nhap index can xoa");
                index = input.nextInt();
                delete_element_function(array_number, index);
                System.out.println("Ban muon them pt theo index ko:\n Nhap 1 (Co) hoac 0 (Khong) ");
                num_chose = input.nextInt();
                if (num_chose == 1) {
                    choice(num_chose, array_number);
                }
                ;
                break;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("So phan tu mang");
        int n = input.nextInt();
        ArrayList<Float> array_number = new ArrayList<Float>();

        System.out.println("Nhap cac phan tu mang theo tung dong: ");
        for(int i=0; i<n; i++)
        {
            float element = input.nextFloat();
            array_number.add(element);
        }

        System.out.println("Gia tri trung binh cua array");
        average_function(array_number);
        System.out.println("Phan tu lon nhat va nho nhat cua mang");
        find_max_min_function(array_number);
        System.out.println("Phan tu duong lon nhat va nho nhat cua mang");
        find_positiveNumber_max_min_function(array_number);
        System.out.println("Phan tu am lon nhat va nho nhat cua mang");
        find_negativeNumber_max_min_function(array_number);
        System.out.println("Cac phan tu chan le");
        all_even_old_number(array_number);

        System.out.println("Ban muon them hoac xoa phan tu khong ?\n"
                          +"1.Them phan tu \n"
                          +"2.Xoa phan tu \n" + "Ban nhap so de chon");
        int num_chose = input.nextInt();
        choice(num_chose, array_number);
    }
}
