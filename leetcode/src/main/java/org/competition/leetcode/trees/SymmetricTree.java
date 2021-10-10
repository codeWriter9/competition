package org.competition.leetcode.trees;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode r1, TreeNode r2) {
        if(r1 == null && r2 == null) return true;
        else if(r1 == null || r2 == null || r1.val != r2.val) return false;
        else return isSymmetric(r1.left, r2.right) && isSymmetric(r1.right, r2.left);
    }

}