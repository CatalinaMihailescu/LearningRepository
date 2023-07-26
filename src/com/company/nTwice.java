package com.company;

import java.util.Scanner;

public class nTwice {
    public static void main(String args[]) {
        Scanner my_scan = new Scanner(System.in);
        String str = my_scan.nextLine();

        Scanner my_scan2 = new Scanner(System.in);
        int n = my_scan2.nextInt();

        if (str.length() >= n)
            System.out.println(str.substring(0, n) + (str.substring( str.length()- n, str.length())));
    }
}
