package com.company;

import java.util.Scanner;

public class inOrder {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        Scanner in2 = new Scanner(System.in);
        int b = in2.nextInt();

        Scanner in3 = new Scanner(System.in);
        int c = in3.nextInt();

        Scanner n = new Scanner(System.in);
        boolean bOk = n.nextBoolean();

        if( bOk )
            System.out.println( c > b );
        else
            System.out.println( b > a && c > b);
    }
}
