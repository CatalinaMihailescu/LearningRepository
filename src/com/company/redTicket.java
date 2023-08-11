package com.company;

import java.util.Scanner;

public class redTicket {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        Scanner in2 = new Scanner(System.in);
        int b = in2.nextInt();

        Scanner in3 = new Scanner(System.in);
        int c = in3.nextInt();

        if (a == 2 && b == 2 && c == 2)
            System.out.println("10");
        else
            if (a == b && b == c)
            System.out.println("5");
            else
                if (a != b && a != c)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
