package com.company;

import java.util.Scanner;

public class middleThree {

    public static void main (String args[]){
        Scanner my_scan = new Scanner(System.in);
        String my_str = my_scan.nextLine();

        int l = my_str.length();
        if (l % 2 != 0) {
            int half = my_str.length() / 2;
            System.out.println(my_str.substring(half -1, half +2));}
        else
            System.out.println("Please enter a string of odd length");
        }
}