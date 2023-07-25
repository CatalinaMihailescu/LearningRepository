package com.company;

import java.util.Scanner;

public class middleTwo {
    public static void main(String args[]) {
        Scanner my_scan = new Scanner(System.in);
        String str = my_scan.nextLine();

        int len = str.length() / 2;
        if (str.length() % 2 == 0){
            System.out.println(str.substring(len-1, len+1));}
        else
            System.out.println("Give a string of even length");
    }

}
