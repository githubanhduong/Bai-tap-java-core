// java program to reverse a word

import java.io.*;
import java.util.Scanner;

public class bai6 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String str, nstr = "";
        char ch;

        System.out.print("Nhap tu:\n ");
        str = input.nextLine();

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);
    }
}

