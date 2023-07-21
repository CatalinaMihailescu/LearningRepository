package com.company;

import java.util.Scanner;

public class nonStart {
    public static void main(String args[]){
        Scanner my_scan = new Scanner(System.in);
        String my_str = my_scan.nextLine();
        Scanner my_scan2 = new Scanner(System.in);
        String my_str2 = my_scan2.nextLine();
        System.out.println(my_str.substring(1) + my_str2.substring(1));
    }
}