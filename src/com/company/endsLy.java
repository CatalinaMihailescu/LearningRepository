package com.company;

import java.util.Scanner;

public class endsLy {
    public static void main (String args[]){
        Scanner my_scan = new Scanner(System.in);
        String my_str = my_scan.nextLine();

        int len = my_str.length();

        String ly = "ly";
        if (len < 2)
            System.out.println("False" );
        else if (ly.equals(my_str.substring(len-2,len)))
            System.out.println("True" );
        else
            System.out.println("False" );;
    }
}
