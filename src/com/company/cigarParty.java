package com.company;

import java.util.Scanner;

public class cigarParty {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int cigars = in.nextInt();

        Scanner n = new Scanner(System.in);
        boolean isWeekend = n.nextBoolean();

        if (isWeekend == true && cigars >= 40)
            System.out.println( "true");
        if (!(isWeekend) && cigars >=40 && cigars <= 60)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
