package org.competition.leetcode.trees;

import java.util.Collections;
import java.util.List;

public class MinimumDistance {

    public int minDiffInBST(TreeNode root) {
        List<Integer> values = new java.util.ArrayList<>();
        traverse(root, values);
        if(values.isEmpty()) return 0;
        if (values.size() == 1) return values.get(0);
        Collections.sort(values);
        int distance = Integer.MAX_VALUE;
        for(int index=1;index<values.size();index++) {
            System.out.println(" absolute value " + Math.abs(values.get(index) - values.get(index - 1)));
            System.out.println(" distance " + distance);
            distance = Math.min(distance, Math.abs(values.get(index) - values.get(index - 1)));
        }
        return distance;
    }

    private void traverse(TreeNode root, List<Integer> values) {
        if(root == null) return;
        values.add(root.val);
        traverse(root.left, values);
        traverse(root.right, values);
    }
}
