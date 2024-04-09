package DemoEx;

import java.util.Scanner;

public class BinaryToDec {

    public static void main(String[] args)
    {
        int n, a=0,b=0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter a binary digit (0 or 1) :");
            n= scanner.nextInt();
            if (n !=0 && n != 1){
                continue;
            }
            b+= Math.pow(2,a)*n;
            a++;
        }while (a<8);
        System.out.println("This is equivalent to decimal:"+b);
    }
}
