package com.company;

import java.util.Scanner;

public class teenSum {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        Scanner in2 = new Scanner(System.in);
        int b = in2.nextInt();

        int sum = a + b;
        if ( ( a >=13 && a<=19) || ( b >=13 && b<=19) )
            System.out.println("19");
        else
            System.out.println(sum);
    }
}
