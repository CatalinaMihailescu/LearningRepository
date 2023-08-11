package com.company;

import java.util.Scanner;

public class specialEleven {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if ( n % 11 == 0 || n % 10 == 1 )
            System.out.println("True");
        else
            System.out.println("False");
    }
}
