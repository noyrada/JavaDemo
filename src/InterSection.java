import java.util.HashSet;
import java.util.Set;

public class InterSection
{
    public static void main(String[] args)
    {
        //Create first set
        Set<Integer> set1 = new HashSet<>();
        set1.add(3);
        set1.add(5);
        set1.add(6);
        System.out.println("Set 1:" + set1);

        //Creating second set
        Set<Integer> set2 = new HashSet<>();
        set2.add(5);
        set2.add(8);
        set2.add(0);
        System.out.println("Set 2:"+set2);

        //Intersection of 2 set
        Intersection(set1,set2);


    }

    public static void Intersection(Set<Integer> s1, Set<Integer> s2){
        s2.retainAll(s1); //intersection
        System.out.println("Intersection: "+s2);
    }
}
