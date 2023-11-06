package org.competition.leetcode.dp;

import java.util.Arrays;

public class PredictTheWinner {

    /**
     * example 1 [1,5,2]
     * <p>
     * nums = [1,5,2]
     * dp = [0,0,0]
     * <p>
     * Step 1:
     * dp = [0,0,nums[2]]
     * dp = [0,0,2]
     * <p>
     * Step 2:
     * dp = [0,nums[1],2]
     * dp = [0,5,2]
     * dp = [0,5,Max(nums[1] - dp[2], nums[2] - dp[1])]
     * dp = [0,5,Max(5 - 2, 2 - 5)]
     * dp = [0,5,3]
     * <p>
     * Step 3:
     * dp = [nums[0],5,2]
     * dp = [1,Max(nums[0] - dp[1], nums[1] - dp[0]),3]
     * dp = [1,Max(1 - 5, 5 - 1),3]
     * dp = [1,4,Max(nums[0] - dp[2], nums[2] - dp[1])]
     * dp = [1,4,Max(1 - 2, 2 - 4)]
     * dp = [1,4,-1]
     * as dp[dp.length - 1] < 0 so false
     * <p>
     * <p>
     * <p>
     * Input: nums = [1,5,233,7]
     * Output: true
     * Explanation: Player 1 first chooses 1. Then player 2 has to choose between 5 and 7. No matter which number player 2 choose, player 1 can choose 233.
     * Finally, player 1 has more score (234) than player 2 (12), so you need to return True representing player1 can win.
     * <p>
     * <p>
     * Input: nums = [4,8,233,6,7]
     * Output: false
     * if player 1 chooses 4, player 2 can choose 8 or 7
     * if player 1 chooses 7, player 2 can choose 4 or 6
     * <p>
     * if player 2 chooses 7, player 1 can choose 8 or 6 then player 2 can choose 233
     *
     * @param nums
     * @return
     */
    public boolean predictTheWinner(int[] nums) {
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                evenCount += nums[i];
            } else {
                oddCount += nums[i];
            }
        }
        return evenCount >= oddCount;
    }

    public boolean predictTheWinner2DArray(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = nums[i];
        }
        System.out.println("Initial DP");
        System.out.println("-------");
        print(dp);
        System.out.println("-------");
        for (int len = 1; len < n; len++) {
            for (int i = 0; i < n - len; i++) {
                int j = i + len;
                dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]);
                System.out.println("-------");
                print(dp);
                System.out.println("-------");
            }
        }
        return dp[0][n - 1] >= 0;

    }

    private void print(int [][] dp) {
        for(int row=0;row<dp.length;row++) {
            System.out.println(Arrays.toString(dp[row]));
        }
    }

    /**
     *
     * nums = [1, 5, 2]
     * n = nums.length = 3
     *
     * maxDiff(): left = 0, right = n - 1 = 2
     *
     * 	left == right ? -> no
     *
     * 	scoreByLeft = nums[left] - maxDiff(nums, left + 1, right, n) => nums[0] - maxDiff(nums, 1, 2, 3) => 1 - 3 -> -2
     * 	scoreByRight = nums[right] - maxDiff(nums, left, right - 1, n) => nums[2] - maxDiff(nums, 0, 1, 3) => 2 - 4 -> -2
     *
     * maxDiff(): left = 1, right = 2
     *
     * 	left == right ? -> no
     *
     * 	scoreByLeft = nums[left] - maxDiff(nums, left + 1, right, n) => nums[1] - maxDiff(nums, 2, 2, 3) => 5 - 2 -> 3
     * 	scoreByRight = nums[right] - maxDiff(nums, left, right - 1, n) => nums[2] - maxDiff(nums, 0, 0, 3) => 2 - 1 -> 1
     *
     * 	maxOf(scoreByLeft, scoreByRight) => maxOf(3, 1) -> 3
     *
     *
     * maxDiff(): left = 0, right = 1
     *
     * 	left == right ? -> no
     *
     * 	scoreByLeft = nums[left] - maxDiff(nums, left + 1, right, n) => nums[0] - maxDiff(nums, 1, 1, 3) => 1 - 5 -> -4
     * 	scoreByRight = nums[right] - maxDiff(nums, left, right - 1, n) => nums[1] - maxDiff(nums, 0, 0, 3) => 5 - 1 -> 4
     *
     * 	maxOf(scoreByLeft, scoreByRight) => maxOf(-4, 4) -> 4
     *
     * maxDiff(): left = 2, right = 2
     *
     * 		left == right ? -> yes -> nums[left] -> nums[2] -> 2
     *
     * maxDiff(): left = 1, right = 1
     *
     * 		left == right ? -> yes -> nums[left] -> nums[1] -> 5
     *
     * maxDiff(): left = 0, right = 0
     *
     * 		left == right ? -> yes -> nums[left] -> nums[0] -> 1
     *
     *
     *
     *
     *
     * @param nums
     * @return
     */
    public boolean predictTheWinnerRecursive(int[] nums) {
        return maxDiff(nums, 0, nums.length - 1, nums.length) >= 0;
    }

    private int maxDiff(int[] nums, int left, int right, int n) {
        if (left == right) {
            return nums[left];
        }

        int scoreByLeft = nums[left] - maxDiff(nums, left + 1, right, n);
        int scoreByRight = nums[right] - maxDiff(nums, left, right - 1, n);

        return Math.max(scoreByLeft, scoreByRight);
    }
}
