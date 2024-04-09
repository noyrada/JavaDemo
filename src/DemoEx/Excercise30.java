package DemoEx;

public class Excercise30 {

    //covert from iterative to recursive
    public static void main(String[] args)
    {
        f(4);
    }
    public static int f(int x){
        if(x<0) return 0;

        if(x==0) return 1;

        return f(x-1)*5+1;
    }


}
