package DemoEx;

public class Excercise29 {
    public static void main(String[] args){
        DisplayR(0,0);
    }

    public static void DisplayR(int a,int b){
        if (a<4){
            if (b<10){
                System.out.println(a+10*b+"");

                //The trick of recursive
                DisplayR(a,b+1);
            }
        }
        else DisplayR(a+1,b);
    }
}
