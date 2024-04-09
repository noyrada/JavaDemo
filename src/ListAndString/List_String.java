package ListAndString;

import java.util.ArrayList;

public class List_String {
    static ArrayList<String> declared = new ArrayList<String>();
    static ArrayList<String> javaWords = new ArrayList<String>();
    static ArrayList<Character> legalCharacters = new ArrayList<Character>();


    //part 1:
    public static boolean beginsWithLetter(String s){
        return Character.isLetter(s.charAt(0));
    }

    //part 2:
    public static boolean containsLegalCharacters(String s){
        for (int i=0;i<s.length();i++){
            if (!legalCharacters.contains(s.charAt(i))){
                return false;
            }
        }
        return true;
    }

    //part 3:
    public static boolean notReservedWord(String s){
        return !javaWords.contains(s);
    }

    //part 4:
    public static int occurrence(ArrayList<String> lst,String s){
        int counter=0;
        for(int i=0;i<lst.size();i++){
            if(s.equals(lst.get(i))){
                counter++;
            }
        }
        return counter;
    }

    //part 5:
    public static boolean existOnce(String s){
        return occurrence(declared,s) == 1;
    }

    //part 6:
    public static ArrayList<String> badIdentifiers(){
        ArrayList<String> badIdentifiers = new ArrayList<>();

        for (int i=0;i<declared.size();i++){
            String s = declared.get(i);
            if (!beginsWithLetter(s) || !containsLegalCharacters(s) ||
             !notReservedWord(s) || !existOnce(s))
                badIdentifiers.add(s);
        }
        return badIdentifiers;
    }

    public static void main(String[] args)
    {
        // Testing the functionalities of existing methods

        // Example strings
        String validIdentifier = "myVariable";
        String invalidIdentifier = "123Invalid";

        // Test beginsWithLetter method
        System.out.println(validIdentifier + " begins with a letter: " + beginsWithLetter(validIdentifier));
        System.out.println(invalidIdentifier + " begins with a letter: " + beginsWithLetter(invalidIdentifier));

        // Test containsLegalCharacters method
        System.out.println(validIdentifier + " contains legal characters: " + containsLegalCharacters(validIdentifier));
        System.out.println(invalidIdentifier + " contains legal characters: " + containsLegalCharacters(invalidIdentifier));

        // Test notReservedWord method
        System.out.println(validIdentifier + " is not a reserved word: " + notReservedWord(validIdentifier));
        System.out.println("assert" + " is not a reserved word: " + notReservedWord("assert"));

        // Test occurrence method
        ArrayList<String> testList = new ArrayList<>();
        testList.add(validIdentifier);
        testList.add(validIdentifier);
        testList.add("anotherVariable");
        System.out.println("Occurrences of " + validIdentifier + " in the list: " + occurrence(testList, validIdentifier));

        // Test existOnce method
        declared.add(validIdentifier);
        declared.add("anotherVariable");
        System.out.println(validIdentifier + " exists once: " + existOnce(validIdentifier));

        // Test badIdentifiers method
        declared.add(invalidIdentifier);
        ArrayList<String> badIds = badIdentifiers();
        System.out.println("Bad identifiers: " + badIds);
    }

}
