package org.competition.leetcode.trees;

public class BinaryTreeSearch {

    public TreeNode searchBST(TreeNode head, int val) {
        if(head == null) return null;
        else return search(head, val);
    }

    private TreeNode search(TreeNode head, int val) {
        if(head.val == val) return head;
        TreeNode node = searchBST(head.left, val);
        if(node == null) node = searchBST(head.right, val);
        return node;
    }

}
