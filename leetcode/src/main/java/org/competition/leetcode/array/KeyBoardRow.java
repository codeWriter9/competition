package org.competition.leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyBoardRow {

    String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};

    Map<Character, Integer> charToRow = new HashMap<>();

    {
        int rowCounter = 1;
        for (String row : rows) {
            for (char c : row.toCharArray()) {
                charToRow.put(c, rowCounter);
            }
            rowCounter++;
        }
    }

    public String[] findWords(String[] words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            int currentRow = -1;
            boolean isOnSameRow = true;
            for (char c : word.toLowerCase().toCharArray()) {
                int r = charToRow.get(c);
                if (currentRow != -1 && r != currentRow) {
                    isOnSameRow = false;
                    break;
                }
                currentRow = r;
            }
            if (isOnSameRow) result.add(word);
        }
        return result.toArray(new String[0]);
    }
}
