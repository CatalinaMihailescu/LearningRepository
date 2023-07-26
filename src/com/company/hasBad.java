package com.company;

import java.util.Scanner;

public class hasBad {
    public static void main(String args[]) {
        Scanner my_scan = new Scanner(System.in);
        String str = my_scan.nextLine();

        if (str.length() < 3) {
            System.out.println("False"); }
        else if ((str.substring(0, 3)).equals("bad"))
            System.out.println("True");
        else if (str.length() > 3) {
            if ((str.substring(1, 4)).equals("bad"))
                System.out.println("True");}
        else
            System.out.println("False");
        }
    }