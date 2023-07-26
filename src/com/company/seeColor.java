package com.company;

import java.util.Scanner;

public class seeColor {

    public static void main(String args[]) {
        Scanner my_scan = new Scanner(System.in);
        String colour = my_scan.nextLine();

        if(colour.length() >= 3 && colour.substring(0, 3).equals("red"))
            System.out.printf("red");

        if(colour.length() >= 4 && colour.substring(0, 4).equals("blue"))
            System.out.printf("blue");

        System.out.printf( " " );

        }
    }