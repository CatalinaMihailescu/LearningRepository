package com.company;

import java.util.Scanner;

public class twoChar {

    public static void main(String args[]) {
        Scanner my_scan = new Scanner(System.in);
        String str = my_scan.nextLine();

        Scanner in = new Scanner(System.in);
        int index = in.nextInt();

        if (str.length() <= index + 1 || index < 0)
            System.out.println(str.substring(0,2));
        else
            System.out.println (str.substring(index, index + 2));

    }
}

