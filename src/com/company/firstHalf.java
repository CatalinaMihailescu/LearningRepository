package com.company;

import java.util.Scanner;

public class firstHalf {
    public static void main(String args[]){
        Scanner my_scan = new Scanner(System.in);
        String my_str = my_scan.nextLine();
        System.out.println(my_str.substring(0,my_str.length() /2 ));
    }
}
