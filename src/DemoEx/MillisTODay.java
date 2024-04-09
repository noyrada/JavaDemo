package DemoEx;

import java.util.Scanner;

public class MillisTODay {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        long t;
        long days,hours,minutes,seconds,millis;
        final long max = 9999999999L;

        do {
            System.out.println("Enter Num in Milliseconds :");
            t= scanner.nextLong();
        }while (t<0 || t>max);

        millis = t%1000;
        t /= 1000; //t=t/1000; t in seconds

        seconds = t % 60;
        t/=60; // t in minute

        minutes = t % 60;
        t/=60;   // t in hours

        hours = t/24;
        days = t/24;

        System.out.println("Day :"+days);
        System.out.println("Hour :"+hours);
        System.out.println("Minute :"+minutes);
        System.out.println("Second :"+seconds);
        System.out.println("Millis :"+millis);
    }
}
