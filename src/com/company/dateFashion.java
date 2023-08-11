package com.company;

import java.util.Scanner;

public class dateFashion {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int you = in.nextInt();

        Scanner in2 = new Scanner(System.in);
        int data = in2.nextInt();

        if ((you >= 8 && data > 2) || (data >= 8 && you > 2))
            System.out.println("2");
        else
            if ((data <= 2) || (you <= 2))
                System.out.println("0");
        else
            System.out.println("1");

        }
    }
