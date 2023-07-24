package com.company;

import java.util.Scanner;

public class conCat {
    public static void main(String args[]) {
        Scanner my_scan = new Scanner(System.in);
        String str = my_scan.nextLine();
        Scanner my_scan2 = new Scanner(System.in);
        String str2 = my_scan2.nextLine();

        if ( str.length() == 0 || str2.length() == 0 )
            System.out.println(str + str2);

        if (str.substring(str.length()-1, str.length()).equals(str2.substring(0,1)))
            System.out.println(str + (str2.substring(1, str2.length())));
        else System.out.println(str+str2);
    }
}