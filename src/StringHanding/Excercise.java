package StringHanding;

public class Excercise {
    public static void main(String[] args)
    {
        String s1= "",s2="";
        int cnt =1;
        for (int i=0;i<50;i++){
            s1 += aeSort();
        }
        for (int i=0;i<s1.length()-1;i++){
            if (s1.charAt(i) == s1.charAt(i+1))
                cnt++;
            else {
                if (cnt != 1)  // There is repetition{
                {
                    s2 += s1.charAt(i) + ""+cnt;
                    cnt =1;
                }
                else {    //No repetition
                    s2 += s1.charAt(i);
                }
            }
            s2 += s1.charAt(s1.length()-1);
            System.out.println(s1);
            System.out.println(s2);
        }
    }
    public static char aeSort(){
        return (char) (64+Math.random()*5);
    }

}
