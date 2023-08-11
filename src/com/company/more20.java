package com.company;

import java.util.Scanner;

public class more20 {
    public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

     if ( n % 20 == 0 )
         System.out.println ("false");
    else
          if ( n % 20 == 1 || n% 20 ==2 )
        System.out.println("true");
    else
        System.out.println ("false");
}
}
