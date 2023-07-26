package com.company;

import java.util.Scanner;

public class extraFont {
    public static void main(String args[]) {
        Scanner my_scan = new Scanner(System.in);
        String initial = my_scan.nextLine();

        String newString = initial;
        if (initial.length() >= 2 )
              newString = initial.substring(0, 2);

        System.out.println(newString + newString + newString);

    }
}