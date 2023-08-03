package com.company;

import java.util.Scanner;

public class squirrelPlay {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int temp = in.nextInt();

        Scanner n = new Scanner(System.in);
        boolean isSummer = n.nextBoolean();

        if (isSummer == true && temp >=60 && temp <=100 )
            System.out.println("true");
            else
                if (isSummer == false && temp >=60 && temp <=90 )
                    System.out.println("true");

                else
                    System.out.println("false");
    }
}
