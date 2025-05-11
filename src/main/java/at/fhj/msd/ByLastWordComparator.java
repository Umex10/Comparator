package at.fhj.msd;

import java.util.Comparator;

public class ByLastWordComparator implements Comparator<String> {

    @Override
    public int compare(String w1, String w2) {

        String[] w1Splited = w1.split(" ");
        String[] w2Splited = w2.split(" ");

        String w1Last = w1Splited[w1Splited.length - 1];
        String w2Last = w2Splited[w2Splited.length - 1];

        return w1Last.compareTo(w2Last);
    }

}
