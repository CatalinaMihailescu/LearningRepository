package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class sortaSum {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        Scanner in2 = new Scanner(System.in);
        int b = in2.nextInt();

        int sum = a + b;

        if (sum >= 10 && sum <= 19)
            System.out.println("20");
        else
            System.out.println(sum);
    }
}
