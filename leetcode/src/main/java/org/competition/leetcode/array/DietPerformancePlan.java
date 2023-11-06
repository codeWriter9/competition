package org.competition.leetcode.array;

public class DietPerformancePlan {

    /**
     * Accepted ( Brute force ) solution but takes more than 1 second to execute
     *
     * @param calories
     * @param k
     * @param lower
     * @param upper
     * @return
     */
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int dietPerformance = 0;
        for (int day = 0; day < calories.length - k + 1; day++) {
            int localSum = 0;
            for (int currentStreak = day; currentStreak < day + k; currentStreak++) {
                if (currentStreak < calories.length) {
                    localSum += calories[currentStreak];
                }
            }
            if (localSum > upper) {
                dietPerformance++;
            } else if (localSum < lower) {
                dietPerformance--;
            }
        }
        return dietPerformance;
    }

    /**
     *
     * Faster solution takes 2 ms to execute
     *
     *
     * @param calories
     * @param k
     * @param lower
     * @param upper
     * @return
     */
    public int dietPlanPerformanceFast(int[] calories, int k, int lower, int upper) {
        int performance = 0;
        int caloriespDay = 0;
        for (int startingDay = 0, endingDay = 0; endingDay <= calories.length; endingDay++) {
            if (endingDay - startingDay == k) {
                if (caloriespDay < lower) performance--;
                if (caloriespDay > upper) performance++;
                if (endingDay == calories.length) break;
                caloriespDay += calories[endingDay];
                caloriespDay -= calories[startingDay];
                startingDay++;
            } else {
                caloriespDay += calories[endingDay];
            }
        }
        return performance;
    }
}
