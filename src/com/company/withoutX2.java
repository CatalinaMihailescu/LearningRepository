package com.company;

import java.util.Scanner;

public class withoutX2 {
    public static void main(String args[]) {
        Scanner my_scan3 = new Scanner(System.in);
        String str3 = my_scan3.nextLine();

        if (str3.length() == 1 && str3.charAt(0) == 'x')
            System.out.println("");

        if (str3.length() >= 2) {
            if (str3.charAt(0) == 'x' && str3.charAt(1) == 'x') {
                System.out.println(str3.substring(2));
            } else if (str3.charAt(0) == 'x') {
                System.out.println(str3.substring(1));
            } else if (str3.charAt(1) == 'x') {
                System.out.println(str3.charAt(0) + str3.substring(2));
            }
        }
        System.out.println(str3);

    }
}
