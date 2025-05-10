package at.fhj.msd;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        
        
        String s1 = "Umejr";
        String s2 = "letsgo";

        int result = String.CASE_INSENSITIVE_ORDER.compare(s1, s2);
        
        StringIgnoreCaseComparator ig = new StringIgnoreCaseComparator();
        int result2 = ig.compare(s1, s2);

        System.out.println(result);
        System.out.println(result2);

    }
}
