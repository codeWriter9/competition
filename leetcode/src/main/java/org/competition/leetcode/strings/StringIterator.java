package org.competition.leetcode.strings;

import java.util.Arrays;

public class StringIterator {

    String[] strings;
    Integer[] counts;

    Integer pointer;

    public StringIterator(String compressedString) {
        strings = compressedString.split("[0-9]+");
        String[] countStr = compressedString.split("[a-zA-Z]+");
        counts = new Integer[countStr.length - 1];
        System.out.println("strings.length = " + strings.length);
        System.out.println("counts.length = " + countStr.length);
        System.out.println("strings = " + Arrays.toString(strings));
        System.out.println("counts = " + Arrays.toString(countStr));
        int i = 0;
        for (int index = 0; index < countStr.length; index++) {
            if (countStr[index].length() > 0) counts[i++] = Integer.parseInt(countStr[index]);
        }
        pointer = 0;
        System.out.println("strings.length = " + strings.length);
        System.out.println("counts.length = " + counts.length);
        System.out.println("strings = " + Arrays.toString(strings));
        System.out.println("counts = " + Arrays.toString(counts));
    }

    public char next() {
        if (!hasNext())
            return ' ';
        counts[pointer]--;
        char res = strings[pointer].charAt(0);
        if (counts[pointer] == 0)
            pointer++;
        return res;
    }

    public boolean hasNext() {
        return pointer < strings.length && pointer < counts.length;
    }
}
