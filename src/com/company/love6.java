package com.company;

import java.util.Scanner;

public class love6 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        Scanner in2 = new Scanner(System.in);
        int b = in2.nextInt();

        if (a ==6 || b== 6 )
            System.out.println("true");

        int sum = a+b;
        int dif = Math.abs (a-b);

        if ( sum == 6 || dif == 6 )
            System.out.println("true");
        else
            System.out.println("false");
    }
}
