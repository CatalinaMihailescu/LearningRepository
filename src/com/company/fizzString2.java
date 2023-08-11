package com.company;

import java.util.Scanner;

public class fizzString2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if ( n % 3 == 0 && n % 5 == 0)
            System.out.println("FizzBuzz!");
        else
            if ( n % 5 == 0 )
                System.out.println("Buzz!");
            else
                if ( n % 3 == 0)
                    System.out.println("Fizz!");
                else
                    System.out.println(n + "!");
    }
}
