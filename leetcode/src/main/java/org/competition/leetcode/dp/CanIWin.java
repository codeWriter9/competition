package org.competition.leetcode.dp;

import java.util.*;

public class CanIWin {

    /**
     *
     *
     * @param maxChoosableInteger
     * @param desiredTotal
     * @return
     */

    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        long start = System.currentTimeMillis();
        boolean canIWin;
        if (desiredTotal <= maxChoosableInteger) {
            canIWin = true;
            long end = System.currentTimeMillis();
            //System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Time taken: " + (end - start) + " ms");
            return canIWin;
        }
        if (((1 + maxChoosableInteger) / 2 * maxChoosableInteger) < desiredTotal) {
            canIWin = false;
            long end = System.currentTimeMillis();
            //System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Time taken: " + (end - start) + " ms");
            return canIWin;
        }
        boolean[] choose = new boolean[maxChoosableInteger + 1];
        canIWin = canIWin(desiredTotal, choose, maxChoosableInteger, new HashMap<>());
        //System.out.println(" choose path: " + Arrays.toString(choose));
        long end = System.currentTimeMillis();
        //System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Time taken: " + (end - start) + " ms");
        return canIWin;
    }

    private boolean canIWin(int desiredTotal, boolean[] choose, int maxChoosableInteger, Map<String, Boolean> cache) {

        //System.out.println("desiredTotal: " + desiredTotal);
        if (desiredTotal <= 0) {
            //System.out.println("[Exit as ] desiredTotal: " + desiredTotal);
            return false;// exit condition
        } else {
            String current = Arrays.toString(choose);
            if(cache.containsKey(current)) {
                return cache.get(current);// return from cache
            }
            for (int index = 1; index <= maxChoosableInteger; index++) { // for every choice in the array
                //System.out.println("[at the start of the loop] choose[" + index + "]: " + Arrays.toString(change(choose)));
                if (choose[index]) continue;// continue if already chosen
                choose[index] = true; // choose it
                //System.out.println("[after choosing the index] choose[" + index + "]: " + Arrays.toString(change(choose)));
                if (!canIWin(desiredTotal - index, choose, maxChoosableInteger, cache)) {
                    //System.out.println("[in if] choose[" + index + "]: " + Arrays.toString(change(choose)));
                    choose[index] = false;// add it back
                    cache.put(current, true);
                    return true;// if the other player cannot win, then I win
                }
                choose[index] = false;// add it back as it did not work
            }
            cache.put(current, false);
            return false;
        }
    }

    private int [] change(boolean [] choose) {
        List<Integer> list = new ArrayList<>();
        for(int index = 0; index < choose.length; index++) {
            if(choose[index]) {
                list.add(index);
            }
        }
        int [] arr = new int[list.size()];
        for(int index=0; index < list.size(); index++) {
            arr[index] = list.get(index);
        }
        return arr;
    }
}