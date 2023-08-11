package com.company;

import java.util.Scanner;

public class in1To10 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Scanner outside = new Scanner(System.in);
        boolean outsideMode = outside.nextBoolean();

        if (!outsideMode) {
            if (n >= 1 && n <= 10) {
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
        else {
            if (n <= 1 || n >= 10) {
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
    }
}
