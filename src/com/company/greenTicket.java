package com.company;

import java.util.Scanner;

public class greenTicket {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        Scanner in2 = new Scanner(System.in);
        int b = in2.nextInt();

        Scanner in3 = new Scanner(System.in);
        int c = in3.nextInt();

        if ( a != b || a!=c || b != c )
            System.out.println("0");
        if ( a==b && a==c && b==c)
            System.out.println("20");
        if ( a==b || a==c || b==c)
            System.out.println("10");
    }
}