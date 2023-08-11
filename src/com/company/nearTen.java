package com.company;

import java.util.Scanner;

public class nearTen {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num % 10 < 3 || num % 10 >= 8)
            System.out.println("True");
        else
            System.out.println("False");
    }
}

