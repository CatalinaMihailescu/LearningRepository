package com.company;
public class Main {

    public static void main(String[] args) {
        int answer = 7 + 3 * 4;
        System.out.println(answer);

        double radius = 12.0;
        double area = Math.PI * radius * radius;

        int x = 20;
        int y = x++;
        System.out.println(String.valueOf(x));

        double a = 12 * 3 / 4.0;
        double b = (12 * 3) / 4.0;
        double c = 12 * (3 / 4.0);
        System.out.printf("%s %s %s %n", a, b, c);

        a = 12 * 3 / 4;
        b = (12 * 3) / 4;
        c = 12 * (3 / 4);
        System.out.printf("%s %s %s %n", a, b, c);

        double d = 12.0 / 3.0 / 4.0;
        double e = (12.0 / 3.0) / 4.0;
        double f = 12.0 / (3.0 / 4.0);
        System.out.printf("%s %s %s %n", d, e, f);


        for (int month = 1; month <=12; month++) {
            System.out.printf("The next month after %s is %s%n", month, month % 12 +1);
        }



      //  int a = 12;
      //  int b = 0;
      //  if (b != 0 && divideTwoNumbers(a,b) == 2) {
      //      System.out.println("we've found a 2. ");
      //  }
    }

    private static int divideTwoNumbers(int x, int y){
        return x / y ;
    }

}
