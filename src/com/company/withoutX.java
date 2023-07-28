package com.company;

import java.util.Scanner;

public class withoutX {
    public static void main(String args[]) {
        Scanner my_scan = new Scanner(System.in);
        String str = my_scan.nextLine();

        if (str.length() == 0)
            System.out.println(str);

        if (str.length() == 1) {
            if (str.charAt(0) == 'x')
                System.out.println("");
            else
                System.out.println(str);
        }
        if (str.charAt(0) == 'x')
            str = str.substring(1,str.length());
        if (str.charAt(str.length()-1) == 'x')
            str = str.substring(0,str.length()-1);

        System.out.println(str);
    }
}
