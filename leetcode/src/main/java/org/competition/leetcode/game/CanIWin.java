package org.competition.leetcode.game;

import java.util.Map;

public class CanIWin {

    boolean [] choose;
    Map<String, Boolean> cache;

    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if(maxChoosableInteger >= desiredTotal) { // if I can choose entire number I win
            return true;
        }
        else {
            if((maxChoosableInteger + 1) * maxChoosableInteger / 2 < desiredTotal) { // n * (n + 1) / 2 < desiredTotal
                // means I can't win
                return false;
            }
        }
        return false;
    }

    private boolean canIWin(int maxChoosableInteger, int desiredTotal, int total) {
        if(total >= desiredTotal) {
            return false;
        }
        for(int chosen = 1; chosen < maxChoosableInteger + 1; chosen++) {
            if(choose[chosen]) { // if this number already chosed
                continue;// continue with the next number
            }
            choose[chosen] = true;// choose this number
            if(!canIWin(maxChoosableInteger, desiredTotal, total + chosen)) { // next player can't win
                choose[chosen] = false;
                return true;
            }
            choose[chosen] = false;
        }
        return false;
    }
}