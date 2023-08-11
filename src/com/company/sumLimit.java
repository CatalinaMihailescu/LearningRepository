package com.company;

import javax.lang.model.element.NestingKind;
import java.util.Scanner;

public class sumLimit {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        Scanner in2 = new Scanner(System.in);
        int b = in2.nextInt();

        int sum = a+b;

        int l = String.valueOf(a).length();
        int lsum = String.valueOf(sum).length();

        if ( l == lsum)
            System.out.println(sum);
        if ( lsum > l)
            System.out.println(a);
    }
}
