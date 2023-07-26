package com.company;

import java.util.Scanner;

public class without2 {
    public static void main(String args[]) {
        Scanner my_scan = new Scanner(System.in);
        String str = my_scan.nextLine();

        if (str.length() == 2)
            System.out.println("");
        if (str.length() < 2)
            System.out.println(str);
        else {
            if (str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()))) {
                System.out.println(str.substring(2, str.length()));
            } else System.out.println(str);
        }
    }
}
