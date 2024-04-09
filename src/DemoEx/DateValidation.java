package DemoEx;

import java.util.Scanner;

public class DateValidation {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n,d,m,y;
        int daysNumber;

        do {
            System.out.println("Enter a date from of 5 Digits: ");
            n=scanner.nextInt();
        }while (n<1010000 || n> 31129999);

        //Getting day, month,year
        y = n % 10000;
        n/=10000;
        m = n% 100;
        d = n /100;

        //validation
        if (m > 1 && m <12){
           switch (m){
               case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                   daysNumber = 31;
                   break;

               case 4: case 6: case 9: case 11:
                   daysNumber = 30;
                   break;

               default:
                   //leap year
                   if(y%400 == 0 || (y%100 !=0 && y% 4 ==0))
                       daysNumber = 29;  //February Day in leap year = 29
                   else {
                       daysNumber = 28;
                   }

                   if (d >= 1 && d <= daysNumber) {
                       System.out.println(d+"/"+m+"/"+y+"is a valid date.");
                   }
                   else {
                       System.out.println(d+"/"+m+"/"+y+"is not a valid date.");
                   }
           }
        }
        else {
            System.out.println(d+"/"+m+"/"+y+"is not a valid date.");
        }

    }
}
