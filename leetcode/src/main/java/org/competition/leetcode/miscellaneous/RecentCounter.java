package org.competition.leetcode.miscellaneous;

import java.util.LinkedList;

public class RecentCounter {
    private LinkedList<Integer> container;
    public RecentCounter() {
        container = new LinkedList<>();
    }

    public int ping(int delta) {
        container.addLast(delta);
        while(container.getFirst() < delta - 3000)
            container.removeFirst();
        System.out.println("container size: " + container.size());
        return container.size();
    }
}