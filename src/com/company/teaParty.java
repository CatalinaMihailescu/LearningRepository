package com.company;

import java.util.Scanner;

public class teaParty {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int tea = in.nextInt();

        Scanner in2 = new Scanner(System.in);
        int candy = in2.nextInt();

        if ( tea < 5 || candy < 5)
            System.out.println("0");
        if ( (tea >= 2*candy) || (candy >= 2*tea))
            System.out.println("2");
        else
            System.out.println("1");
    }
}
