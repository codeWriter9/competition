package org.competition.leetcode.array;

public class PlusOne {

    public int[] plusOne(int [] array) {
        int carryOver = 1;
        for(int i=array.length - 1;i>-1;i--) {
            int temp = (array[i] + carryOver) % 10;
            carryOver = (int)((array[i] + carryOver) / 10);
            array[i] = temp;
            if(carryOver ==0) break;
        }
        if(carryOver > 0) {
            int [] temp = new int[array.length + 1];
            for(int i=array.length - 1;i>0;i--) {
                temp[i] = array[i];
            }
            temp[0] = carryOver;
            array = temp;
        }
        return array;
    }
}