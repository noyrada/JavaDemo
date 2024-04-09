package StudentGrade;

import javax.swing.undo.AbstractUndoableEdit;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.Scanner;

public class projectOne {
    public static void main(String[] args)
    {

    }

    //part 1:
    public static String[][] Enter(){
        Scanner scanner = new Scanner(System.in);
        String[][] s = new String[20][3];

        for(int i=0;i<s.length;i++){
            s[i][0] = i + "";
            System.out.print("Enter name of student nb:"+i+1);
            s[i][1] = scanner.next();

            System.out.print("Enter the grade of nb."+i+1);
            s[i][2] = scanner.next();
        }
        return s;
    }

    //part 2:
    public static ArrayList<Integer> ExtractNumber(String[][] s){
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i=0;i<s.length;i++){
            numbers.add(Integer.parseInt(s[i][0]));
        }
        return numbers;
    }

    //part 3:
    public static ArrayList<String> ExtractNames(String[][] s){
        ArrayList<String> names = new ArrayList<>();

        for (int i=0;i<s.length;i++){
            names.add(s[i][1]);
        }
        return names;
    }

    //part 4:
    public static ArrayList<Double> ExtractGrades(String[][] s){
        ArrayList<Double> grades = new ArrayList<>();

        for (int i=0;i<s.length;i++){
            grades.add(Double.parseDouble(s[i][2]));
        }
        return grades;
    }

}

















