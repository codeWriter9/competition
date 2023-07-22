package org.competition.leetcode.trees;

public class MaximumDiameter {

    int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        diameter(root);
        return diameter;
    }

    private int diameter(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = diameter(root.left);
        int right = diameter(root.right);
        diameter = Math.max(diameter, left + right);
        return Math.max(left, right) + 1;
    }
}
