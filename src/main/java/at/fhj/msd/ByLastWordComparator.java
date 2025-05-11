package at.fhj.msd;

import java.util.Comparator;

public class ByLastWordComparator implements Comparator<String> {

    @Override
    public int compare(String w1, String w2) {

        boolean ignoreCase = false; //set boolean

        String[] w1Splited = w1.split(" ");
        String[] w2Splited = w2.split(" ");

        String w1Last = w1Splited[w1Splited.length - 1]; //LAST ELEMENT
        String w2Last = w2Splited[w2Splited.length - 1];

        if (w1Last.equals(w2Last)) {
            if (ignoreCase) {
                return w1.compareToIgnoreCase(w2);
            }
            return w1.compareTo(w2);

        } else {

            return w1Last.compareTo(w2Last);
        }

    }

}
