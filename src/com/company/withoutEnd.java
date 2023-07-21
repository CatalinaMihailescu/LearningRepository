package com.company;

import java.util.Scanner;

public class withoutEnd {
    public static void main(String args[]) {
        Scanner my_scan = new Scanner(System.in);
        String f = my_scan.nextLine();

        System.out.println(f.substring(1, f.length()-1 ));


    }
}