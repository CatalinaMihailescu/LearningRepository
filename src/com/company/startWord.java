package com.company;

import java.util.Scanner;

public class startWord {
    public static void main(String args[]) {
        Scanner my_scan = new Scanner(System.in);
        String str = my_scan.nextLine();

        Scanner my_scan2 = new Scanner(System.in);
        String word = my_scan2.nextLine();

        if ((str.length() >= word.length()) && str.substring(1,word.length()).equals(word.substring(1)))
            System.out.println(str.substring(0,word.length()));
        System.out.println(" ");
    }
}