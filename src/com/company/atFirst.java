package com.company;

import java.util.Scanner;

public class atFirst {
    public static void main(String args[]) {
        Scanner my_scan = new Scanner(System.in);
        String str = my_scan.nextLine();

        if (str.length() == 1)
            System.out.println(str.substring(0, 1) + "@");
        else
            if (str.length() == 0)
                System.out.println("@@");
        else
                System.out.println(str.substring(0, 2));

        }
    }

