package com.company;

import java.util.Scanner;

public class minCat {

    public static void main(String args[]) {
        Scanner my_scan = new Scanner(System.in);
        String a = my_scan.nextLine();
        Scanner my_scan2 = new Scanner(System.in);
        String b = my_scan2.nextLine();

        if (a.length()>=b.length())
            System.out.println(a.substring(a.length() - b.length()) + b);
        else
            if (b.length()>=a.length())
                System.out.println(a+b.substring(b.length() - a.length()));
        else
                System.out.println(a+b);
    }
}

