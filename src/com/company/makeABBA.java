package com.company;

import java.util.Scanner;

public class makeABBA {
    public static void main(String args[]) {
        Scanner my_scan = new Scanner(System.in);
        String a = my_scan.nextLine();
        Scanner my_scan2 = new Scanner(System.in);
        String b = my_scan2.nextLine();

        System.out.println(a+b+b+a);
    }
}