package com.company;

import java.util.Scanner;

public class fizzString {

    public static void main(String args[]) {
        Scanner my_scan = new Scanner(System.in);
        String str = my_scan.nextLine();

        if(str.length() > 0 && str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b')
            System.out.println("FizzBuzz");
        else
            if(str.length() > 0 && str.charAt(str.length() - 1) == 'b')
            System.out.println("Buzz");
            else
            if (str.length() > 0 && str.charAt(0)=='f')
                System.out.println("Fizz");

        else System.out.println(str);

    }
}
