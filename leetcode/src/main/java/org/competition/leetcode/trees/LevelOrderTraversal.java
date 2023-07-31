package org.competition.leetcode.trees;

import java.util.ArrayList;
import java.util.List;

public class LevelOrderTraversal {

    public List<List<Integer>> levelOrderTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        levelOrderTraversal(root, result, 0);
        return result;
    }

    private void levelOrderTraversal(TreeNode root, List<List<Integer>> result, int level) {
        if (root == null) {
            return;
        }
        if (result.size() == level) {
            result.add(new ArrayList<>());
        }
        result.get(level).add(root.val());
        levelOrderTraversal(root.left(), result, level + 1);
        levelOrderTraversal(root.right(), result, level + 1);
    }
}
