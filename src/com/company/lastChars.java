package com.company;

import java.util.Scanner;

public class lastChars {
    public static void main(String args[]) {
        Scanner my_scan = new Scanner(System.in);
        String a = my_scan.nextLine();

        Scanner my_scan2 = new Scanner(System.in);
        String b = my_scan2.nextLine();

        String aString = "@";
        String bString = "@";

        if (a.length() > 0)
            aString = a.substring(0, 1);

        if (b.length() > 0)
            bString = b.substring(b.length() - 1);

        System.out.println(aString + bString);
    }
}