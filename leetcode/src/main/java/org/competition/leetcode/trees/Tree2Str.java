package org.competition.leetcode.trees;

public class Tree2Str {
    public String tree2str(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        tree2Str(root, sb);
        return sb.toString();
    }

    private void tree2Str(TreeNode root, StringBuilder builder) {
        if (root == null) {
            return;
        }
        builder.append(root.val);
        if (root.left != null) {
            builder.append("(");
            tree2Str(root.left, builder);
            builder.append(")");
        }
        if (root.right != null) {
            if (root.left == null) {
                builder.append("()");
            }
            builder.append("(");
            tree2Str(root.right, builder);
            builder.append(")");
        }
    }
}
