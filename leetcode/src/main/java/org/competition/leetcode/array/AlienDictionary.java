package org.competition.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class AlienDictionary {

    public boolean isAlienSorted(String[] words, String order) {
        List<Character> listOfChars = order.chars()
                .collect(ArrayList::new,
                        (list, item) -> list.add((char) item),
                        (list1, list2) -> list1.addAll(list2));
        for (int index = 0; index < words.length - 1; index++) {
            int position = 0;
            for (; position < words[index].length(); position++) {
                if (position >= words[index + 1].length()) return false;// shorter word should come first.
                if (isSorted(words[index].charAt(position), words[index + 1].charAt(position), listOfChars) == -1) {
                    break;// check next 2 words
                } else if (isSorted(words[index].charAt(position), words[index + 1].charAt(position), listOfChars) == 1) {
                    return false;
                }
            }
            if (position < words[index].length() && position == words[index + 1].length())
                return false;// shorter word should come first.
        }
        return true;
    }

    private int isSorted(char c1, char c2, List<Character> listOfChars) {
        if (listOfChars.indexOf(c1) < listOfChars.indexOf(c2)) {
            return -1;
        } else if (listOfChars.indexOf(c1) > listOfChars.indexOf(c2)) {
            return 1;
        } else return 0;
    }
}
