package at.fhj.msd;

import java.util.Comparator;

public class CharacterUpperAfterLowerComparator implements Comparator<Character> {

    @Override
    public int compare(Character c1, Character c2) {

        //For letters
        if (Character.isLowerCase(c1) && Character.isUpperCase(c2)) {
            return -1;
        }
        if (Character.isUpperCase(c1) && Character.isLowerCase(c2)) {
            return 1;
        }

        if ((Character.isLowerCase(c1) && Character.isLowerCase(c2)) || (Character.isUpperCase(c1) && Character.isUpperCase(c2))) {

            return c1.compareTo(c2);
        }

        //For Digits 
        if (Character.isDigit(c1) && Character.isAlphabetic(c2)) {
            return 1;
        }
        if (Character.isAlphabetic(c1) && Character.isDigit(c2)) {
            return -1;
        }
        if (Character.isDigit(c1) && Character.isDigit(c2)) {
            return c1.compareTo(c2);
        }

        throw new IllegalArgumentException("Unsupported character comparison: " + c1 + " vs " + c2);
    }

}
