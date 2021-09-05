package org.competition.leetcode.trees;

public class ValidBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode root, Integer low, Integer high) {
        if(root != null) {
            // check if current node's value is not between low and high
            if((low!=null && root.val <= low) || (high!=null && root.val >= high)) return false;
            // check if the subtrees are also valid
            else return isValidBST(root.left, low, root.val) && isValidBST(root.right, root.val, high);
        }
        return true;
    }

}
