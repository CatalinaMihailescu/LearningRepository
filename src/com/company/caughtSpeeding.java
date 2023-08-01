package com.company;

import java.util.Scanner;

public class caughtSpeeding {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int speed = in.nextInt();

        Scanner n = new Scanner(System.in);
        boolean isBirthday = n.nextBoolean();

        int noTicket = 0;
        int smallFee = 1;
        int bigTicket =2;

        if (!(isBirthday)) {
            if (speed <= 60)
                System.out.println(noTicket);
            if (speed > 60 && speed <= 80)
                System.out.println(smallFee);
            else
                System.out.println(bigTicket);
        }
        else if ( speed <= 65)
            System.out.println(noTicket);
        else if ( speed > 65 && speed <= 85)
            System.out.println(smallFee);
        else
            System.out.println(bigTicket);
        }
    }