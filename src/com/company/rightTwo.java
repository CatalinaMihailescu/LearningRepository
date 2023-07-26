package com.company;

import java.util.Scanner;

public class rightTwo {

    public static void main(String args[]) {
        Scanner my_scan = new Scanner(System.in);
        String str = my_scan.nextLine();

        String b = str.substring(str.length()-2);

        if (str.length() > 2) {
            System.out.println(b + str.substring(0, str.length()-2));
        } else
            System.out.println(str);

    }
}