package org.competition.leetcode.strings;

public class LongPressedName {

    public boolean isLongPressedName(String name, String typed) {
        if(name.equals(typed)) return true;
        else {
            int nameIndex = 0;
            int typedIndex = 0;
            while (nameIndex < name.length() && typedIndex < typed.length()) { // while there are
                // still characters to compare
                if (name.charAt(nameIndex) == typed.charAt(typedIndex)) { // if they are equal, move both pointers
                    nameIndex++;// move ahead
                    typedIndex++;// move ahead
                } else if (typedIndex > 0 && typed.charAt(typedIndex) == typed.charAt(typedIndex - 1)) { // if they are
                    // not equal, but the current typed character is equal to the previous typed character
                    typedIndex++;// move only typed ahead
                } else {
                    return false; // if the charcter not equal then return false
                }
            }
            while (typedIndex < typed.length()) { // still some characters left
                if (typed.charAt(typedIndex) != typed.charAt(typedIndex - 1)) { //and they are unique return false
                    return false;
                }
                typedIndex++;
            }
            return nameIndex == name.length();
        }
    }
}
