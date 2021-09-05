package org.competition.leetcode.trees;

import static java.lang.Math.max;

public class MaximumDepthBSTTree {

    public int maxDepth(TreeNode root) {
        if(root == null) return 0;// if null then 0
        else if(root.left == null && root.right == null) return 1;// count this node
        else return 1 + max(maxDepth(root.left), maxDepth(root.right));// count and add to max depth
    }

}
