package org.competition.leetcode.trees;

import java.util.*;

public class FindMode {

    Map<Integer, Integer> frequency = new HashMap<>();
    int max = -1;

    public int[] findMode(TreeNode root) {
        update(root);
        return mode();
    }

    private void update(TreeNode root) {
        if(root != null) {
            update(root.left);
            if(frequency.containsKey(root.val)) {
                frequency.put(root.val, frequency.get(root.val) + 1);
            }
            else frequency.put(root.val, 1);
            max = Math.max(max, frequency.get(root.val));
            update(root.right);
        }
    }

    private int [] mode() {
        int[] result = new int[frequency.size()];
        int index = 0;
        for(int node : frequency.keySet()) {
            if(frequency.get(node) == max) result[index++] = node;
        }
        return Arrays.copyOf(result, index);
    }
}
