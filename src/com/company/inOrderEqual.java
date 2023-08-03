package com.company;

import java.util.Scanner;

public class inOrderEqual {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        Scanner in2 = new Scanner(System.in);
        int b = in2.nextInt();

        Scanner in3 = new Scanner(System.in);
        int c = in3.nextInt();

        Scanner n = new Scanner(System.in);
        boolean equalOk = n.nextBoolean();

        if (equalOk && a<=b && b<=c)
            System.out.println( "true");
        else
            if ( !equalOk && a<b && b<c)
                System.out.println("true");
            else
                System.out.println("false");
    }
}
