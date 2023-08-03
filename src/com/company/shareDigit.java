package com.company;

import java.util.Scanner;

public class shareDigit {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        Scanner in2 = new Scanner(System.in);
        int b = in2.nextInt();

        int lefta = a / 10;
        int leftb = b /10;
        int righta = a % 10;
        int rightb = b % 10;

        if ( lefta == leftb || lefta == rightb || righta == leftb ||righta == rightb)
            System.out.println("True");
    }
}
