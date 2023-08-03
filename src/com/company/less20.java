package com.company;

import java.util.Scanner;

public class less20 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n % 20 == 18 || n % 20 == 19)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
