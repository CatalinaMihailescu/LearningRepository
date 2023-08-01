package com.company;

import java.util.Scanner;

public class twoAsOne {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        Scanner in2 = new Scanner(System.in);
        int b = in2.nextInt();

        Scanner in3 = new Scanner(System.in);
        int c = in3.nextInt();

        if ( a+b == c || a+c == b || b+c==a )
            System.out.println("True");
        else
            System.out.println("False");
    }
}

