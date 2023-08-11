package com.company;

import java.util.Scanner;

public class blueTicket {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        Scanner in2 = new Scanner(System.in);
        int b = in2.nextInt();

        Scanner in3 = new Scanner(System.in);
        int c = in3.nextInt();

        int ab = a + b;
        int ac = a + c;
        int bc = b + c;

        if ((ab == 10) || (ac == 10) || (bc == 10))
            System.out.println("10");
        else
             if (ab - bc == 10 || ab - ac == 10) {
                 System.out.println("5");
             }
        else System.out.println("0");
    }
}
