package org.competition.leetcode.trees;


public class FlattenBinaryTree {

    private TreeNode head;

    public void flatten(TreeNode root) {
        if (root == null) return;

        flatten(root.right);
        flatten(root.left);
        root.right = head;
        root.left = null;
        head = root;
    }
}
