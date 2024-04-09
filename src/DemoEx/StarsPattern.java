package DemoEx;

import java.util.Scanner;

public class StarsPattern {
    public static void main(String[] args)
    {
         int n,stars,spaces;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter n:");
            n= scanner.nextInt();
        }while (n<5 || n>15 || n%2 == 0);
        stars = n;
        spaces = 0;

        //First stars triangle
        for (int i = 0;i<n;i++)
        {
            for (int j=0;j<spaces;j++) System.out.print("*");
            for (int j=0;j<stars;j++) System.out.print(" ");
            System.out.println();
            stars--;
            spaces++;
        }

        //second stars triangle
        stars =2;
        spaces = n-2;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<spaces;j++) System.out.print("*");
            for (int j=0;j<stars;j++) System.out.print(" ");
            System.out.println();
            spaces--;
            stars++;
        }
    }
}
