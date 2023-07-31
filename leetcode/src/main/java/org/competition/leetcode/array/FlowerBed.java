package org.competition.leetcode.array;

public class FlowerBed {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int index = 0; index < flowerbed.length; index++) {
            boolean isLeft = index == 0 || flowerbed[index - 1] == 0;
            boolean isRight = index == flowerbed.length - 1 || flowerbed[index + 1] == 0;
            if (isLeft && isRight && flowerbed[index] == 0) {
                flowerbed[index] = 1;
                count++;
            }
            if (count >= n) return true;
        }
        return count >= n;
    }
}
