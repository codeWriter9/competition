package org.competition.leetcode.trees;

import static java.lang.Integer.MIN_VALUE;

public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) { this();this.val = val; }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this(val);
        this.left = left;
        this.right = right;
    }

    public String toString() {
        return val + "";
    }

    public static TreeNode tree(int... array) {
        if(array!=null && array.length > 0) {
            TreeNode root = node(array[0]);
            for(int index=1;index<array.length;index++) {
                insert(root, node(array[index]));
            }
            return root;
        }
        else return node(MIN_VALUE);
    }

    public static void insert(TreeNode root, TreeNode current) {
        if(root != null) {
            if(root.val > current.val && root.left == null) {
                root.left = current;
            }
            else if(root.val <= current.val && root.right == null) {
                root.right = current;
            }
            else if(root.val > current.val) {
                insert(root.left, current);
            }
            else {
                insert(root.right, current);
            }
        }
    }

    public static TreeNode node(int data) {
        return new TreeNode(data);
    }

    public static TreeNode node(int data, TreeNode left, TreeNode right) {
        return new TreeNode(data, left, right);
    }

    public static void inOrder(TreeNode root) {
        if(root != null) {
            inOrder(root.left);
            System.out.println(root.val);
            inOrder(root.right);
        }
    }
}
