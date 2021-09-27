package org.competition.leetcode.array;

public class ValidMountainArray {

    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;
        else {
            int previous = arr[0];
            boolean isHill = false;
            boolean isValley = false;
            for(int index=1;index< arr.length;index++) {
                if(arr[index] - previous == 0) return false;
                else if(arr[index] - previous > 0 && isValley) return false;
                else if(arr[index] - previous < 0) {
                    isValley = true;
                }
                else if(arr[index] - previous > 0 && !isValley) {
                    isHill = true;
                }
                previous = arr[index];
            }
            return isValley && isHill;
        }
    }
}