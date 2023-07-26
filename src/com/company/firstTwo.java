package com.company;
import java.util.Scanner;
public class firstTwo {
    public static void main(String args[]) {
        Scanner my_scan = new Scanner(System.in);
        String str = my_scan.nextLine();

        if (str.length()>2)
            System.out.println(str.substring(0, 2));
        else
            System.out.println(str);
    }
}
