package org.competition.leetcode.trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root != null) {
            return levelOrder(root, 0, new ArrayList<>());
        }
        return null;
    }

    private List<List<Integer>> levelOrder(TreeNode current, int index, List<List<Integer>> list) {
        if(current != null) {
            List<Integer> currentLevel;
            if(index < list.size()) {
                currentLevel = list.get(index);
                currentLevel.add(current.val);
                list.set(index, currentLevel);
            }
            else {
                currentLevel = new ArrayList<>();
                currentLevel.add(current.val);
                list.add(currentLevel);
            }
            list = levelOrder(current.left, index + 1, list);
            list = levelOrder(current.right, index + 1, list);
            return list;
        }
        return list;
    }

}
