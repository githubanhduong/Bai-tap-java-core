import java.util.*;

public class bai8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a Sentence: ");
        String line = input.nextLine();
        String upper_case_line = "";
        Scanner line_Scan = new Scanner(line);
        while (line_Scan.hasNext()) {
            String word = line_Scan.next();
            upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(upper_case_line.trim());
    }
}
