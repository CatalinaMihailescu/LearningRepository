package com.company;

import java.util.Scanner;

public class withoutDoubles {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int die1 = in.nextInt();

        Scanner in2 = new Scanner(System.in);
        int die2 = in2.nextInt();

        Scanner n = new Scanner(System.in);
        boolean noDoubles = n.nextBoolean();

        if(noDoubles && die1 == die2) {
            die1++;
            if(die1 == 7)
                die1 = 1;
        }
        System.out.println( die1 + die2 );
}
}
