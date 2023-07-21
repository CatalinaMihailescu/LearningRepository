package com.company;

import java.util.Scanner;

public class withouEnd2 {
    public static void main(String args[]) {
        Scanner my_scan = new Scanner(System.in);
        String str = my_scan.nextLine();

        if (str.length() >= 2)
            System.out.println(str.substring(1, str.length() - 1));
        System.out.println("");
    }
}
