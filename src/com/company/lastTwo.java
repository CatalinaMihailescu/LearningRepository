package com.company;

import java.util.Scanner;

public class lastTwo {
    public static void main(String args[]) {
        Scanner my_scan = new Scanner(System.in);
        String str = my_scan.nextLine();

        if (str.length() >= 2)
            System.out.println(str.substring(0, str.length()-2) + str.charAt(str.length()-1) + str.charAt(str.length()-2));
        else
            System.out.println(str);
    }
}
