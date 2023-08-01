package com.company;

import java.util.Scanner;

public class maxMod5 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        Scanner in2 = new Scanner(System.in);
        int b = in2.nextInt();

        if ( a == b)
            System.out.println( "0");
        if (a % 5 == b% 5){
            int result = Math.min(a,b);
            System.out.println(result); }
         System.out.println(( Math.max(a,b)));
    }
}
