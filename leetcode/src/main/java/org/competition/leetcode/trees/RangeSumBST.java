package org.competition.leetcode.trees;

public class RangeSumBST {

    public int rangeSumBST(TreeNode root, int low, int high) {
        return rangeSumBST(root, low, high, 0);
    }

    private int rangeSumBST(TreeNode root, int low, int high, int sum) {
        if(root != null) {
            if(root.val >= low && root.val <= high) {
                sum += root.val;
            }
            sum = rangeSumBST(root.left, low, high, sum);
            sum = rangeSumBST(root.right,low, high, sum);
            return sum;
        }
        return sum + 0;
    }
}
