package com.company;

import java.util.Scanner;

public class left2 {
    public static void main(String args[]) {
        Scanner my_scan = new Scanner(System.in);
        String left2 = my_scan.nextLine();

        System.out.println(left2.substring(2) + left2.substring(0,2));
    }
}
