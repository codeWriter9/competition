package org.competition.leetcode.trees;

import java.util.Objects;

import static java.lang.Integer.MIN_VALUE;
import static java.util.Objects.hash;

public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this();
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this(val);
        this.left = left;
        this.right = right;
    }

    public TreeNode right() {
        return right;
    }

    public TreeNode left() {
        return left;
    }

    public int val() {
        return val;
    }

    @Override
    public String toString() {
        return val + "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TreeNode)) return false;
        TreeNode treeNode = (TreeNode) o;
        return val == treeNode.val;
    }

    @Override
    public int hashCode() {
        return hash(val);
    }

    public static TreeNode tree(int... array) {
        if (array != null && array.length > 0) {
            TreeNode root = node(array[0]);
            for (int index = 1; index < array.length; index++) {
                insert(root, node(array[index]));
            }
            return root;
        } else return node(MIN_VALUE);
    }

    public static void insert(TreeNode root, TreeNode current) {
        if (root != null) {
            if (root.val > current.val && root.left == null) {
                root.left = current;
            } else if (root.val <= current.val && root.right == null) {
                root.right = current;
            } else if (root.val > current.val) {
                insert(root.left, current);
            } else {
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
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.val);
            inOrder(root.right);
        }
    }

    public static void postOrder(TreeNode root) {
        if(root != null) {
            inOrder(root.left);
            inOrder(root.right);
            System.out.println(root.val);
        }
    }

    public static void preOrder(TreeNode root) {
        if(root != null) {
            System.out.println(root.val);
            inOrder(root.left);
            inOrder(root.right);
        }
    }
}
