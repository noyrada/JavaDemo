package DemoEx;

import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args)
    {
        //part 2:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 Numbers :");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int m = Divisible(384,4);
        System.out.println(" "+m+ "  Times");
    }

    //part 1:
    public static int Divisible(int x,int y)
    {
        if (x%y !=0) return -1;

        int c = 0;
        while (x/y != 0 && x%y == 0)
        {
            x/=y;
            c++;
        }
        return c;
    }
}
