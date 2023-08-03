package com.company;

import java.util.Scanner;

public class answerCell {

    public static void main(String args[]) {

        Scanner n = new Scanner(System.in);
        boolean isMorning = n.nextBoolean();
        Scanner n1 = new Scanner(System.in);
        boolean isMom = n1.nextBoolean();
        Scanner n2 = new Scanner(System.in);
        boolean isAsleep = n2.nextBoolean();


        if (isAsleep)
            System.out.println("false");
        else
            if ( isMorning && !! isMom )
                System.out.println("false");
            else
                System.out.println("true");
    }
}
