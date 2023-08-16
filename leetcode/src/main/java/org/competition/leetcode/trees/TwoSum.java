package org.competition.leetcode.trees;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public boolean findTarget(TreeNode root, int k) {
        return find(root, k, new HashMap<>());
    }

    private boolean find(TreeNode root, int k, Map<Integer, Integer> map) {
        if (root == null) {
            return false;
        }
        if (map.containsKey(k - root.val)) {
            return true;
        }
        map.put(root.val, 1);
        return find(root.left, k, map) || find(root.right, k, map);
    }
}
