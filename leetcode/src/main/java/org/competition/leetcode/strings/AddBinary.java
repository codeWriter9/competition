package org.competition.leetcode.strings;

public class AddBinary {

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int aCounter = a.length() - 1;
        int bCounter = b.length() - 1;
        char [] Aarray = a.toCharArray();
        char [] Barray = b.toCharArray();
        char carryOver = '0';
        while(aCounter >= 0 && bCounter >= 0) {
            char aIndex = Aarray[aCounter];
            char bIndex = Barray[bCounter];
            char [] r = add(aIndex, bIndex, carryOver);
            sb.append(r[0]);
            carryOver = r[1];
            aCounter--;
            bCounter--;
        }
        if(aCounter >= 0) {
            while(aCounter >= 0) {
                char[] r = add(Aarray[aCounter], '0', carryOver);
                sb.append(r[0]);
                carryOver = r[1];
                aCounter--;
            }
        }
        if(bCounter >= 0) {
            while(bCounter >= 0) {
                char[] r = add(Barray[bCounter], '0', carryOver);
                sb.append(r[0]);
                carryOver = r[1];
                bCounter--;
            }
        }
        if(carryOver == '1') {
            sb.append(carryOver);
        }
        return sb.reverse().toString();
    }

    private char [] add(char a, char b, char c) {
        char [] r = new char[2];
        if(a == '0' && b == '0' && c == '0') {
            r[0] = '0';
            r[1] = '0';
        }
        else if(a == '1' && b == '0' && c == '0') {
            r[0] = '1';
            r[1] = '0';
        }
        else if(a == '0' && b == '1' && c == '0') {
            r[0] = '1';
            r[1] = '0';
        }
        else if(a == '0' && b == '0' && c == '1') {
            r[0] = '1';
            r[1] = '0';
        }
        else if(a == '1' && b == '1' && c == '0') {
            r[0] = '0';
            r[1] = '1';
        }
        else if(a == '1' && b == '0' && c == '1') {
            r[0] = '0';
            r[1] = '1';
        }
        else if(a == '0' && b == '1' && c == '1') {
            r[0] = '0';
            r[1] = '1';
        }
        else {
            r[0] = '1';
            r[1] = '1';
        }
        return r;
    }

}
