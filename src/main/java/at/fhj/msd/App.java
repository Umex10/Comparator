package at.fhj.msd;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        String s1 = "Umejr";
        String s2 = "letsgo";

        int result = String.CASE_INSENSITIVE_ORDER.compare(s1, s2);

        StringIgnoreCaseComparator ig = new StringIgnoreCaseComparator();
        int result2 = ig.compare(s1, s2);

        System.out.println(result);
        System.out.println(result2);

        ByLastWordComparator StringThing = new ByLastWordComparator();

        String[] fruits = {"banana", "apple", "green apple", "cherry", "yellow banana", "red cherry"};
        String[] fruits2 = { "apple", "green apple", "yellow banana", "red cherry", "cherry", "banana" };

        Arrays.sort(fruits, StringThing);
        Arrays.sort(fruits2, StringThing);

        System.out.println(Arrays.toString(fruits));
         System.out.println(Arrays.toString(fruits2));

    }
}
