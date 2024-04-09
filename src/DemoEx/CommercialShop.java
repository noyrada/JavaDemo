package DemoEx;

import java.util.Scanner;

public class CommercialShop {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of articles:");
        int articles = scanner.nextInt();
        System.out.println("Enter the number of months:");
        int months = scanner.nextInt();

        double[][] salesData = new double[articles][months];

        Enter(salesData);

        double[][] articleStats = statArticles(salesData);
        double[][] monthStats = statMonths(salesData);

        displayStatistics(articleStats, "Article");
        displayStatistics(monthStats, "Month");
    }

    public static void Enter(double[][] v)
    {
        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<v.length;i++){
            for (int j=0;j<v[i].length;j++){
                System.out.println("Article: "+i+", Month: "+j+":");
                v[i][j] = scanner.nextDouble();
            }
        }
    }

    public static double[] statArticle(double[][] v, int a)
    {
        double[] stat = new double[4];
        stat[0] = Double.MIN_VALUE;
        stat[1] = Double.MAX_VALUE;
        stat[2] = 0.0;
        stat[3] = 0.0;

        for (int j=0; j<v[a].length;j++){
            if(v[a][j] > stat[0]){
                stat[0] = v[a][j];   // MAX
            }
            if (v[a][j] < stat[1]){
                stat[1] = v[a][j];  // MIN
            }
            stat[2] +=v[a][j];     // Sum
        }
        stat[3] = stat[2]/v[a].length;   // Average
        return stat;
    }

    public static double[][] statArticles(double[][] v){
        double[][] stat = new double[v.length][4];

        for (int i=0;i<v.length;i++){
            double[] sArt = statArticle(v,i);

            for (int j=0;j<sArt.length;j++){
                stat[i][j] =sArt[j];
            }
        }
        return stat;
    }

    public static double[] statMonth(double[][] v, int m){
        double[] stat = new double[4];
        stat[0] = Double.MIN_VALUE;
        stat[1] = Double.MAX_VALUE;
        stat[2] = 0.0;
        stat[3] = 0.0;

        for (int i=0; i<v.length;i++){
            if(v[i][m] > stat[0]){
                stat[0] = v[i][m];   // MAX
            }
            if (v[i][m] < stat[1]){
                stat[1] = v[i][m];  // MIN
            }
            stat[2] +=v[i][m];     // Sum
        }
        stat[3] = stat[2]/v.length;   // Average
        return stat;
    }

    public static double[][] statMonths(double[][] v){
        double[][] stat = new double[4][v[0].length];

        for (int j=0;j<v[0].length;j++){
            double[] sMonths = statMonth(v,j);

            for (int i=0;i<sMonths.length;i++){
                stat[i][j] =sMonths[i];
            }
        }
        return stat;
    }

    public static void displayStatistics(double[][] stats, String type) {
        System.out.println(type + " Statistics:");
        for (int i = 0; i < stats.length; i++) {
            for (int j = 0; j < stats[i].length; j++) {
                System.out.print(stats[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

