package com.company;

import java.util.Scanner;

public class extraEnd {
    public static void main(String args[]) {
        Scanner my_scan = new Scanner(System.in);
        String f = my_scan.nextLine();

        if (f.length() >= 2 )
            f = f.substring(f.length()-2);

        System.out.println(f + f + f);

    }
}