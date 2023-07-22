package org.competition.leetcode.array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RelativeRanks {

    class Rank {
        int index;
        int value;

        public Rank(int index, int value) {
            this.index = index;
            this.value = value;
        }

        @Override
        public int hashCode() {
            return value;
        }

        @Override
        public boolean equals(Object obj) {
            return ((Rank) obj).value == this.value;
        }

        @Override
        public String toString() {
            return new StringBuilder("[")
                    .append("index = " + index)
                    .append(",value = " + value)
                    .append("]")
                    .toString();
        }
    }

    public String[] findRelativeRanks(int[] scores) {
        List<Rank> ranks = new ArrayList<>();
        for (int index = 0; index < scores.length; index++) {
            ranks.add(new Rank(index, scores[index]));
        }
        ranks.sort(new Comparator<Rank>() {
            @Override
            public int compare(Rank o1, Rank o2) {
                return o2.value > o1.value ? 1 : o2.value == o1.value ? 0 : -1;
            }
        });
        String[] result = new String[scores.length];
        for (int i = 0; i < ranks.size(); i++) {
            result[ranks.get(i).index] = getRank(i);
        }
        return result;
    }

    private String getRank(int index) {
        switch (index) {
            case 0:
                return "Gold Medal";
            case 1:
                return "Silver Medal";
            case 2:
                return "Bronze Medal";
            default:
                return String.valueOf(index + 1);
        }
    }
}
