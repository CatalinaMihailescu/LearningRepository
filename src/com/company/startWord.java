package com.company;

import java.util.Scanner;

public class startWord {
    public static void main(String args[]) {
        Scanner my_scan = new Scanner(System.in);
        String str = my_scan.nextLine();

        Scanner my_scan2 = new Scanner(System.in);
        String word = my_scan2.nextLine();

        int lstr = str.length();
        int lword = word.length();

        if (lstr == 0)
            System.out.println("");

        if (lstr > lword)
            System.out.println("");

        if (lword == 1)
            System.out.println(str.substring(0,1));
        else if (str.substring(1,lword).equals(word.substring(1,lword)))
            System.out.println(str.substring(0,lword));
        else
            System.out.println("");
    }
}