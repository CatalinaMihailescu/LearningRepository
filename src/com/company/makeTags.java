package com.company;

import java.util.Scanner;

public class makeTags {

    public static void main(String args[]) {
        Scanner my_scan = new Scanner(System.in);
        String word = my_scan.nextLine();

        Scanner my_scan2 = new Scanner(System.in);
        String tag = my_scan2.nextLine();

        System.out.println("<" + tag + ">" + word + "</" + tag + ">");
    }
}
