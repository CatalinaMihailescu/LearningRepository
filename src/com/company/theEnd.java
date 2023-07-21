package com.company;

import java.util.Scanner;

public class theEnd {
    public static void main(String args[]){
        Scanner my_scan = new Scanner(System.in);
        String my_str = my_scan.nextLine();

        Scanner bool = new Scanner (System.in);
        boolean front = bool.nextBoolean();

        if (!front) {
            System.out.println( my_str.substring(my_str.length()-1));
        } else {
            System.out.println( my_str.substring(0,1) );
        }
    }
    }

