package org.example;

import java.util.Comparator;

public class IComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 < 0 && o1 % 2-1 != 0 && o2< 0 && o2 % 2-1 != 0) {
            return o2.compareTo(o1);
        } else  {
            return o1.compareTo(o2);
        }
    }
}
