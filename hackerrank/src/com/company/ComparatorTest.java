package com.company;

import java.util.Comparator;

public class ComparatorTest implements Comparator<Player> {


    public int compare(Player a, Player b) {
        /*
        if (a.score < b.score ) {
            return 1;
        }
        if (a.score > b.score ) {
            return -1;
        }

         */

        if (b.score==a.score) {
            return a.name.compareTo(b.name);
        }
        return b.score - a.score;

    }
}
