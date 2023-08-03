package com.company;

import java.util.Scanner;

public class alarmClock {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();

        Scanner n = new Scanner(System.in);
        boolean vacation = n.nextBoolean();

        if (vacation) {
            if(day > 0 && day != 6)
                System.out.println("10:00");
            else
                System.out.println("Off");
        }
        else
            if (day > 0 && day != 6)
                System.out.println("07:00");
            else
                System.out.println("10:00");
    }
}

