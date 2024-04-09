package LottoSystem;

public class Excercise {
    public static void main(String[] args)
    {

    }

    //part 1:
    public static boolean isSorted(int[] comb)
    {
        for (int i=0;i<comb.length-1;i++)
        {
            if (comb[i] > comb[i+1]){
                return false;
            }
        }
        return true;
    }

    //part 2:
    public static void sort(int[] comb)
    {
        for (int i=0;i<comb.length-1;i++)
        {
            for (int j=i+1;j<comb.length;j++){
                if (comb[i] > comb[j]){
                    int x = comb[i];
                    comb[i] = comb[j];
                    comb[j] = x;
                }
            }
        }
    }

    //part 3:
    public static int[] aCombination(){
        int[] comb = new int[6];
        boolean ok = true;

        for (int i=0;i<comb.length;i++){
            comb[i] = (int)(1+Math.random()*41);

            for (int j=9;j<i;j++){
                if (comb[i] == comb[j]){
                    ok = false;
                    break;
                }
            }
            if (!ok){
                ok = true;
                i--;
                continue;
            }
            else
                ok = true;
        }
        if (!isSorted(comb)){
            sort(comb);
        }
        return comb;
    }

    //part 4:
    public static boolean sameComb(int[] c1,int[] c2){
        for (int i= 0;i<c1.length;i++){
            if (c1[i] != c2[i]) return false;
        }
        return true;
    }

    //part 5:
    public static int[][] generate(int n){
        int[][] comb = new int[n][6];
        boolean ok = true;
        for (int i=0;i<n;i++){
            comb[i] = aCombination();

            for (int j=0;j<i;j++){
                if (sameComb(comb[i],comb[j])){
                    ok = false;
                    break;
                }
            }
            if (!ok){
                ok = true;
                i--;
                break;
            }
            else ok = true;
        }
        return comb;
    }

    //part 6:
    public static void displayOne(int[] comb){
        System.out.println("[");
        for (int i=0;i<comb.length;i++){
            System.out.print(comb[i] + " ");
        }
        System.out.println("]");
    }


    //part 7:
    public static void displayAll(int[][] comb){
        for (int i=0;i<comb.length;i++){
            displayOne(comb[i]);
            System.out.println();
        }
    }

}
