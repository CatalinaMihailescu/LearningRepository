package com.company;
import java.util.Scanner;
public class frontAgain {
    public static void main (String args[]) {
        Scanner my_scan = new Scanner(System.in);
        String str = my_scan.nextLine();

        if (str.length() < 2)
            System.out.println("False");
        else if (str.substring(0,2).equals(str.substring(str.length()-2, str.length())))
            System.out.println("True");
        else
            System.out.println("False");

    }
}
