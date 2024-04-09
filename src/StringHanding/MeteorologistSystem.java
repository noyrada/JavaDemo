package StringHanding;

import java.util.Scanner;

public class MeteorologistSystem
{
    static String[] days = {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
    static double[][] temps = new double[7][4];
    public static void main(String[] args)
    {

    }

    //part 1:
    public static int EnterDay(String j){
        for (int i=0; i<days.length;i++){
            if(j.toLowerCase().equals(days[i])){
                return i;
            }
        }
        return 0; // default day is monday
    }

    //part 2:
    public static void EnterTemp(){
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<temps.length;i++){
            for (int j=0;j<temps[i].length;j++){
                System.out.print("Temp["+i+"]["+j+"]:");
                temps[i][j] = scanner.nextDouble();
            }
        }
    }

    //part 3:
    public static double AverageTempDay(String j){
        int n = EnterDay(j);
        double s=0.0;

        for (int i=0;i<temps[n].length;i++){
            s += temps[n][i];
        }
        return s/temps[n].length;
    }

    //part 4:
    public static String[] hottestDays(double t){
        String[] jp = new String[temps.length];

        int j = 0;
        for (int i=0;i<temps.length;i++){
            if (AverageTempDay(days[i])>= t){
                jp[j++] = days[i];
            }
        }
        return jp;
    }
}
