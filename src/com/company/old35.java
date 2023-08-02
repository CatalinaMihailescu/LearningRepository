package com.company;

import java.util.Scanner;

public class old35 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println((n % 3 == 0) != (n % 5 == 0));

    }
}
