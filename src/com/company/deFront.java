package com.company;

import java.util.Scanner;

public class deFront {
    public static void main(String args[]) {
        Scanner my_scan = new Scanner(System.in);
        String str = my_scan.nextLine();

        String newstr = str.substring(2,str.length());
        if (str.charAt(1)=='b')
            newstr = "b" + newstr;
        if (str.charAt(0)=='a')
            newstr = "a" + newstr;

        System.out.println(newstr);
    }
}
